package com.oracle.databaseapp.container;

import com.oracle.databaseapp.bo.EmployeeBusinessComponent;
import com.oracle.databaseapp.bo.Abstractions.BusinessAbstractions;
import com.oracle.databaseapp.dao.EmployeeDataAccess;
import com.oracle.databaseapp.dao.Abstractions.DataAccessAbstraction;
import com.oracle.databaseapp.entities.Employee;

public class IocContainer {
	
	private static IocContainer _container;
	private IocContainer() {
		System.out.println("container created");
	}
	
	public static IocContainer createContainer() {
		if(_container==null) {
			_container = new IocContainer();
		}
		return _container;
	}
	
	public DataAccessAbstraction<Employee> createDaoInstance() {
		DataAccessAbstraction<Employee> dao = new EmployeeDataAccess();
		return dao;
	}
	public BusinessAbstractions<Employee> createBusinessInstance() {
		BusinessAbstractions<Employee> bo = new EmployeeBusinessComponent();
		return bo;
	}
}
