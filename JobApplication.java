
/* Assignment 5: Job Application
* Write a program that checks if a person is eligible for a job based on their qualifications. 
* A person is eligible if they have a bachelor’s degree or equivalent experience, and they have a clean criminal record.
* Requirements:*/

package Assignment_26;
import java.util.Scanner;
public class JobApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Degree:");
		String degree=sc.next();
		
		System.out.println("Enter Experience:");
		int exp=sc.nextInt();
		
		boolean criminalrecord=true;
		
		if(degree.equals("bachelors") && criminalrecord | exp>=0)
			System.out.println("eligible for a job ");
		
		else
			System.out.println("Not eligible for job");
	}

}
