package com.oracle.databaseapp.userinterface;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;

import com.oracle.databaseapp.bo.EmployeeBusinessComponent;
import com.oracle.databaseapp.bo.Abstractions.BusinessAbstractions;
import com.oracle.databaseapp.container.IocContainer;
import com.oracle.databaseapp.entities.Employee;

public class Program {

	static void printSortChoice() {
		System.out.println("1. sort by id\n2. sort by name");
	}

	static int getSortChoice() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nenter choice[1/2]: ");
		int choice = scanner.nextInt();
		scanner.close();
		return choice;
	}

	public static void main(String[] args) throws SQLException {
		
		//EmployeeBusinessComponent businessComponent = null;
		
		//printAllRecords();
		printRecord();
	}

	private static void printAllRecords() {
		BusinessAbstractions<Employee> businessComponent;
		try {
			printSortChoice();
			int sortChoice = getSortChoice();
			//businessComponent = new EmployeeBusinessComponent();
			businessComponent = IocContainer.createContainer().createBusinessInstance();
			Collection<Employee> records = businessComponent.getSortedRecords(sortChoice);
			records.forEach(e->System.out.println(e));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void printRecord() {
		BusinessAbstractions<Employee> businessComponent;
		try {		
			//businessComponent = new EmployeeBusinessComponent();
			businessComponent = IocContainer.createContainer().createBusinessInstance();
			Employee record = businessComponent.getRecordById(2);
			System.out.println(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
