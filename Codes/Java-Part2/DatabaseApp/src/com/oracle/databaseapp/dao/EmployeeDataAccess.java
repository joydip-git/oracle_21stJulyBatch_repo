package com.oracle.databaseapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.List;

import com.oracle.databaseapp.dao.Abstractions.DataAccessAbstraction;
import com.oracle.databaseapp.dao.utils.DbConstants;
import com.oracle.databaseapp.dao.utils.DbUtils;
import com.oracle.databaseapp.entities.Employee;

import java.util.ArrayList;;

public class EmployeeDataAccess implements DataAccessAbstraction<Employee> {
	String path = null;

	public EmployeeDataAccess() {
		path = DbConstants.CONFIG_FILE_PATH;
	}

	public Collection<Employee> fetchAllRecords() throws SQLException {
		Connection connection = null;
		Statement command = null;
		ResultSet records = null;
		List<Employee> employees = null;
		try {
			connection = DbUtils.createConnection(path);
			// if (connection != null) {
			// System.out.println("connected");
			command = connection.createStatement();
			String selectQuery = DbUtils.readQuery(path, DbConstants.SELECT_QUERY);
			records = command.executeQuery(selectQuery);
			employees = new ArrayList<Employee>();
			while (records.next()) {
				int id = records.getInt("id");
				String name = records.getString("name");
				Employee employee = new Employee(name, id);
				employees.add(employee);
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			DbUtils.closeConnection(connection);
		}
		return employees;
	}

	@Override
	public Employee fetchRecordById(int id) throws SQLException {
		Connection connection = null;
		PreparedStatement command = null;
		ResultSet records = null;
		Employee employee = null;
		try {
			connection = DbUtils.createConnection(path);
			command = connection.prepareStatement(DbUtils.readQuery(path, DbConstants.SELECT_QUERY));
			command.setInt(1, id);
			if (command.execute()) {
				records = command.getResultSet();
				while (records.next()) {
					int idValue = records.getInt("id");
					String name = records.getString("name");
					employee = new Employee(name, idValue);
				}
			} else {
				throw new Exception("could not execute the query");
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			DbUtils.closeConnection(connection);
		}
		return employee;
	}

	@Override
	public boolean addRecord(Employee obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateRecord(Employee obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRecord(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Employee> searchRecordsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
