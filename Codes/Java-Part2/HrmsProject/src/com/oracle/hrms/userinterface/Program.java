package com.oracle.hrms.userinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.oracle.hrms.entities.Employee;
import com.oracle.hrms.manager.EmployeeManager;
import com.oracle.hrms.utils.UiUtil;

/**
 * @author satarupa
 *
 */


public class Program{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UiUtil.showMenu();
		int choice = UiUtil.enterChoice(scanner);
		Employee employeeObjRef = UiUtil.create(scanner, choice);
		employeeObjRef.calculateSalary();
		EmployeeManager managerRef = new EmployeeManager();
		managerRef.addRecord(employeeObjRef);
		ArrayList<Employee> records = managerRef.getRecords();
		for (Employee emp : records) {
			System.out.println(emp.getName()+" has salary of "+emp.getTotalSalary());
		}
		scanner.close();
	}
}

