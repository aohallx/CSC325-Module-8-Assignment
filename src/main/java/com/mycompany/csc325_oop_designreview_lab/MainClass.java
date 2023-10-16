package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// Fix constructor: use Freshman and Senior directly
		Freshman std1 = new Freshman("James", (short) 20, 12);
		Senior std2 = new Senior("John", (short) 30, 90);

		// ToDo 12: set GPA via input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter GPA for " + std1.getName() + ": ");
		double gpa1 = scanner.nextDouble();
		std1.setGpa(gpa1);

		System.out.print("Enter GPA for " + std2.getName() + ": ");
		double gpa2 = scanner.nextDouble();
		std2.setGpa(gpa2);

		// Output
		System.out.println(std1);
		System.out.println(std2);

		scanner.close();
	}
}
