package com.oracle.hrms.repository;
import java.util.ArrayList;

import com.oracle.hrms.entities.Employee;

/**
 * @author satarupa
 *
 */
public class EmployeeRepository {

	private static ArrayList<Employee> employees;
	static {
		employees = new ArrayList<Employee>();
	}
	public static ArrayList<Employee> getEmployees() {
		return employees;
	}
}
