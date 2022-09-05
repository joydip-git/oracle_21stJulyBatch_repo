package com.oracle.hrms.userinterface;

import java.util.Collection;
import java.util.Scanner;

import com.oracle.hrms.entities.Employee;
import com.oracle.hrms.manager.EmployeeManager;
import com.oracle.hrms.utils.UiUtil;

/**
 * @author satarupa
 *
 */

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char toContinue = 'n';
		do {
			UiUtil.showMenu();
			int choice = UiUtil.enterChoice(scanner);
			Employee employeeObjRef = UiUtil.create(scanner, choice);
			employeeObjRef.calculateSalary();
			EmployeeManager managerRef = new EmployeeManager();
			managerRef.addRecord(employeeObjRef);
			Collection<Employee> records = managerRef.getRecords();
			for (Employee emp : records) {
				System.out.println(emp.getName() + " has salary of " + emp.getTotalSalary());
			}
			toContinue = UiUtil.continueOrNot(scanner);
			if (Character.isUpperCase(toContinue)) {
				toContinue = Character.toLowerCase(toContinue);
			}
		} while (toContinue != 'n');
		scanner.close();
	}
}
