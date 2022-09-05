package com.oracle.hrms.repository;

//import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collection;

import com.oracle.hrms.entities.Employee;

/**
 * @author satarupa
 *
 */
public class EmployeeRepository {

	private static EmployeeRepository _repository;

	private EmployeeRepository() {

	}

	private static Collection<Employee> employees;
	static {
		_repository = new EmployeeRepository();
		employees = new TreeSet<Employee>();
		System.out.println("created");
	}

	public Collection<Employee> getEmployees() {
		return employees;
	}

	public static EmployeeRepository Create() {
		return _repository;
		/*
		if (_repository == null) {
			_repository = new EmployeeRepository();
		}
		return _repository;
		*/
	}
}
