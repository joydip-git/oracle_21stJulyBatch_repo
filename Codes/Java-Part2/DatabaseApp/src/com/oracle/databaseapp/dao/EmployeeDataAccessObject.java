package com.oracle.databaseapp.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.List;

import com.oracle.databaseapp.dao.utils.DbConstants;
import com.oracle.databaseapp.dao.utils.DbUtils;
import com.oracle.databaseapp.entities.Employee;

import java.util.ArrayList;;

public class EmployeeDataAccessObject {
	String path = null;

	public EmployeeDataAccessObject() {
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
				Employee employee = new Employee(name,id);
				employees.add(employee);
			}			
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			DbUtils.closeConnection(connection);
		}
		return employees;
	}
}
