/**
 * 
 */
package com.oracle.hrms.manager;

import java.util.ArrayList;

import com.oracle.hrms.entities.Employee;
import com.oracle.hrms.repository.EmployeeRepository;
import com.oracle.hrms.utils.UiUtil;

/**
 * @author satarupa
 *
 */
public class EmployeeManager {
	public boolean addRecord(Employee emp) {
		ArrayList<Employee> records = EmployeeRepository.getEmployees();
		records.add(emp);
		return true;
	}
	public ArrayList<Employee> getRecords(){
		return EmployeeRepository.getEmployees();
	}
}
