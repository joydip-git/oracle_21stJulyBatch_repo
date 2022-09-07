package com.oracle.databaseapp.bo;

import java.util.Collection;
import java.util.List;

import com.oracle.databaseapp.bo.Abstractions.BusinessAbstractions;
import com.oracle.databaseapp.container.IocContainer;
import com.oracle.databaseapp.dao.EmployeeDataAccess;
//import com.oracle.databaseapp.dao.EmployeeDataAccess;
import com.oracle.databaseapp.dao.Abstractions.DataAccessAbstraction;
import com.oracle.databaseapp.entities.Employee;

public class EmployeeBusinessComponent implements BusinessAbstractions<Employee> {

	private DataAccessAbstraction<Employee> dataAccessObject;

	@SuppressWarnings("unchecked")
	public EmployeeBusinessComponent() throws Exception {
		//dataAccessObject = IocContainer.createContainer().createDaoInstance();
		try {
			dataAccessObject = IocContainer.createContainer().createInstance(DataAccessAbstraction.class, EmployeeDataAccess.class);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException
				| SecurityException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	public Collection<Employee> getSortedRecords(int choice) throws Exception {
		// EmployeeDataAccessObject eDataAccessObject = null;
		List<Employee> records = null;

		try {
			// eDataAccessObject = new EmployeeDataAccessObject();
			// records = (List<Employee>) eDataAccessObject.fetchAllRecords();
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
			records.sort((e1, e2) -> e1.getName().toLowerCase().compareTo(e2.getName().toLowerCase()));
			break;

		default:
			records.sort((e1, e2) -> e1.getId() - e2.getId());
			break;
		}
	}

	@Override
	public Employee getRecordById(int id) throws Exception {
		if (id > 0)
			return dataAccessObject.fetchRecordById(id);
		else
			throw new Exception("id of record should be greater than zero");
	}

	@Override
	public boolean insertRecord(Employee obj) throws Exception {
		if (obj != null) {
			if (obj.getId() > 0) {
				return dataAccessObject.addRecord(obj);
			} else {
				throw new Exception("id of record should be greater than zero");
			}
		} else {
			throw new Exception("no data was sent");
		}
	}

	@Override
	public boolean modifyRecord(Employee obj) throws Exception {
		if (obj != null) {
			if (obj.getId() > 0) {
				return dataAccessObject.updateRecord(obj);
			} else {
				throw new Exception("id of record should be greater than zero");
			}
		} else {
			throw new Exception("no data was sent");
		}
	}

	@Override
	public boolean removeRecord(int id) throws Exception {
		if (id != 0) {
			return dataAccessObject.deleteRecord(id);
		} else {
			throw new Exception("id of record should be greater than zero");
		}
	}

	@Override
	public Collection<Employee> searchRecordsByName(String name) throws Exception{
		if (name != null && name != "") {
			List<Employee> records = (List<Employee>)dataAccessObject.searchRecordsByName(name);
			sortRecords(1, records);
			return records;
		} else {
			throw new Exception("name was not sent or empty");
		}
	}
}
