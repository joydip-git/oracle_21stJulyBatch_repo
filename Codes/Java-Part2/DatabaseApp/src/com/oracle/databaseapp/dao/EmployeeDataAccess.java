package com.oracle.databaseapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

	public Collection<Employee> fetchAllRecords() throws Exception {
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
			throw ex;
		} finally {
			DbUtils.closeConnection(connection);
		}
		return employees;
	}

	@Override
	public Employee fetchRecordById(int id) throws Exception {
		Connection connection = null;
		PreparedStatement command = null;
		ResultSet records = null;
		Employee employee = null;
		try {
			connection = DbUtils.createConnection(path);
			command = connection.prepareStatement(DbUtils.readQuery(path, DbConstants.FETCH_SELECT_QUERY));
			command.setInt(1, id);
			records = command.executeQuery();
			while (records.next()) {
				int idValue = records.getInt("id");
				String name = records.getString("name");
				employee = new Employee(name, idValue);
			}

		} catch (Exception ex) {
			throw ex;
		} finally {
			DbUtils.closeConnection(connection);
		}
		return employee;
	}

	@Override
	public boolean addRecord(Employee obj) throws Exception {
		Connection connection = null;
		PreparedStatement command = null;
		try {
			connection = DbUtils.createConnection(path);
			command = connection.prepareStatement(DbUtils.readQuery(path, DbConstants.INSERT_QUERY));
			command.setInt(1, obj.getId());
			command.setString(2, obj.getName());
			int result = command.executeUpdate();
			if (result > 0) {
				return true;
			} else
				return false;

		} catch (Exception ex) {
			throw ex;
		} finally {
			DbUtils.closeConnection(connection);
		}
	}

	@Override
	public boolean updateRecord(Employee obj) throws Exception {
		Connection connection = null;
		PreparedStatement command = null;
		try {
			connection = DbUtils.createConnection(path);
			command = connection.prepareStatement(DbUtils.readQuery(path, DbConstants.UPDATE_QUERY));
			command.setString(1, obj.getName());
			command.setInt(2, obj.getId());
			int result = command.executeUpdate();
			if (result > 0) {
				return true;
			} else
				return false;

		} catch (Exception ex) {
			throw ex;
		} finally {
			DbUtils.closeConnection(connection);
		}
	}

	@Override
	public boolean deleteRecord(int id) throws Exception {
		Connection connection = null;
		PreparedStatement command = null;
		try {
			connection = DbUtils.createConnection(path);
			command = connection.prepareStatement(DbUtils.readQuery(path, DbConstants.DELETE_QUERY));
			command.setInt(1, id);
			int result = command.executeUpdate();
			if (result > 0) {
				return true;
			} else
				return false;

		} catch (Exception ex) {
			throw ex;
		} finally {
			DbUtils.closeConnection(connection);
		}

	}

	@Override
	public Collection<Employee> searchRecordsByName(String name) throws Exception {
		Connection connection = null;
		PreparedStatement command = null;
		ResultSet records = null;
		List<Employee> employees = null;
		try {
			connection = DbUtils.createConnection(path);
			// if (connection != null) {
			// System.out.println("connected");
			command = connection.prepareStatement(DbUtils.readQuery(path, DbConstants.SEARCH_QUERY));
			//System.out.println("execute");
			command.setString(1, name);			
			records = command.executeQuery();
			//System.out.println("executed");
			employees = new ArrayList<Employee>();
			while (records.next()) {				
				int id = records.getInt("id");
				String nameValue = records.getString("name");
				Employee employee = new Employee(nameValue, id);
				employees.add(employee);
			}
		} catch (Exception ex) {
			throw ex;
		} finally {
			DbUtils.closeConnection(connection);
		}
		return employees;
	}
}
