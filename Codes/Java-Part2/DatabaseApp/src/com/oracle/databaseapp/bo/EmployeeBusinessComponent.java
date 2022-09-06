package com.oracle.databaseapp.bo;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import com.oracle.databaseapp.bo.Abstractions.BusinessAbstractions;
import com.oracle.databaseapp.container.IocContainer;
//import com.oracle.databaseapp.dao.EmployeeDataAccess;
import com.oracle.databaseapp.dao.Abstractions.DataAccessAbstraction;
import com.oracle.databaseapp.entities.Employee;

public class EmployeeBusinessComponent implements BusinessAbstractions<Employee> {
	
	private DataAccessAbstraction<Employee> dataAccessObject;
	public EmployeeBusinessComponent() {
		dataAccessObject = IocContainer.createContainer().createDaoInstance();
	}

	public Collection<Employee> getSortedRecords(int choice) throws Exception {
		//EmployeeDataAccessObject eDataAccessObject = null;
		List<Employee> records = null;

		try {
			//eDataAccessObject = new EmployeeDataAccessObject();
			//records = (List<Employee>) eDataAccessObject.fetchAllRecords();
			records = (List<Employee>) dataAccessObject.fetchAllRecords();
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

	@Override
	public Employee getRecordById(int id) throws SQLException {
		return dataAccessObject.fetchRecordById(id);
	}

	@Override
	public boolean insertRecord(Employee obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyRecord(Employee obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeRecord(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Employee> searchRecordsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
