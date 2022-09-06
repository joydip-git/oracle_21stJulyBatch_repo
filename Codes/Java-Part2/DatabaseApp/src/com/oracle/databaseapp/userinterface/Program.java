package com.oracle.databaseapp.userinterface;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;

import com.oracle.databaseapp.bo.EmployeeBusinessComponent;
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
		
		EmployeeBusinessComponent businessComponent = null;
		
		try {
			printSortChoice();
			int sortChoice = getSortChoice();
			businessComponent = new EmployeeBusinessComponent();
			Collection<Employee> records = businessComponent.getSortedRecords(sortChoice);
			records.forEach(e->System.out.println(e));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
