package com.oracle.databaseapp.bo;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import com.oracle.databaseapp.dao.EmployeeDataAccessObject;
import com.oracle.databaseapp.entities.Employee;

public class EmployeeBusinessComponent {

	public Collection<Employee> getSortedRecords(int choice) throws SQLException {
		EmployeeDataAccessObject eDataAccessObject = null;
		List<Employee> records = null;

		try {
			eDataAccessObject = new EmployeeDataAccessObject();
			records = (List<Employee>) eDataAccessObject.fetchAllRecords();
			sortRecords(choice, records);
			return records;
		} catch (Exception e) {
			throw e;
		}
	}

	private void sortRecords(int choice, List<Employee> records) {
		switch (choice) {
		case 1:
			records.sort((e1, e2) -> e1.getId() - e2.getId());
			break;

		case 2:
			records.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
			break;

		default:
			records.sort((e1, e2) -> e1.getId() - e2.getId());
			break;
		}
	}
}
