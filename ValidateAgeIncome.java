
/*Assignment 1: Validating Age and Income
* Write a program that checks if a person is eligible for a loan based on their age and income.
* Requirements:
* •    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
* •    Use logical && to combine these conditions.*/

package Assignment_26;

import java.util.Scanner;

public class ValidateAgeIncome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age & Income:");
		int age = sc.nextInt();
		double income = sc.nextDouble();

		if (age >= 18 && age <= 60 && income > 25000)
			System.out.println("A person is eligible!");
		else
			System.out.println("Person is Not eligible!");

	}

}
