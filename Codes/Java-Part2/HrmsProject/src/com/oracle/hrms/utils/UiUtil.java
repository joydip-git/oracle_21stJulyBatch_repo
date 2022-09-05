package com.oracle.hrms.utils;

import java.util.Scanner;
import com.oracle.hrms.entities.*;

public class UiUtil {
	public static void showMenu() {
		System.out.println("1. Developer \n2. Hr");
	}

	public static int enterChoice(Scanner scanner) {
		System.out.println("\nEnter Choice[1/2]: ");
		int choice = scanner.nextInt();
		return choice;
	}

	public static Employee create(Scanner scanner, int choice) {
		System.out.print("\nName: ");
		String name = scanner.next();

		System.out.print("Id: ");
		int id = scanner.nextInt();

		System.out.print("Basic: ");
		float basic = scanner.nextFloat();

		System.out.print("Da: ");
		float da = scanner.nextFloat();

		System.out.print("Hra: ");
		float hra = scanner.nextFloat();

		Employee employeeRef = null;
		switch (choice) {
		case 1:
			System.out.print("Incentive: ");
			float incentive = scanner.nextFloat();
			employeeRef = new Developer(id,name,basic,da,hra,incentive);
			break;

		case 2:
			System.out.print("Gratuity: ");
			float gratuity = scanner.nextFloat();
			employeeRef = new Hr(id,name,basic,da,hra,gratuity);
			break;
			
		default:
			System.out.print("\nEnter proper choice: ");
			break;
		}

		return employeeRef;
	}
	public static char continueOrNot(Scanner scanner) {		
		System.out.println("\nContinue?[y/n/Y/N]: ");
		char decision = scanner.next().charAt(0);
		return decision;
	}
}
