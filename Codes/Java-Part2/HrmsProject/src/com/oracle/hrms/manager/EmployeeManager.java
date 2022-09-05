/**
 * 
 */
package com.oracle.hrms.manager;

//import java.util.ArrayList;
import java.util.Collection;

import com.oracle.hrms.entities.Employee;
import com.oracle.hrms.repository.EmployeeRepository;
/**
 * @author satarupa
 *
 */
public class EmployeeManager {
	public boolean addRecord(Employee emp) {
		//ArrayList<Employee> records = EmployeeRepository.getEmployees();
		Collection<Employee> records = EmployeeRepository.Create().getEmployees();
		records.add(emp);
		return true;
	}
	public Collection<Employee> getRecords(){
		//return EmployeeRepository.getEmployees();
		return EmployeeRepository.Create().getEmployees();
	}
}
