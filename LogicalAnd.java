
/* Assignment 6: Logical NOT (!) for Negation
*  Write a program that determines whether a number is not between 10 and 20 (inclusive).
*  Requirements:
*  •    Use logical ! to negate conditions*/


package Assignment_26;
import java.util.Scanner;
public class LogicalAnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		if(!(num>=10 && num<=20))
			System.out.println("Number is not between 10 & 20.");
		else
			System.out.println("Number is Between 10 & 20.");

	}

}
