
/* Assignment 4: Voting Eligibility
*  Write a program that checks if a person is eligible to vote. 
*  A person can vote if they are a citizen and their age is 18 or above.
*  Requirements:
*  •    Use logical && to combine conditions, and ! to negate conditions if necessary.*/

package Assignment_26;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Citizenship:");
		String citizen = sc.next();

		System.out.println("Enter Age:");
		int age = sc.nextInt();

		if (citizen.equals("india") && age >= 18) {
			System.out.println("Person is Eligibile for Vote.");
		} 
		else {
			System.out.println(" Person is Not Eligibile ");
		}

		
	}

}
