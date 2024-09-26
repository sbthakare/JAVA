
/* Assignment 3: Door Access Control
*  Write a program that simulates an access control system.
*  A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
*  Requirements:
*  •    Use logical operators &&, ||, and !. */

package Assignment_26;
import java.util.Scanner;

public class DoorAccessControl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		System.out.println("Enter access card number:");
		int access=sc.nextInt();
		System.out.println("Enter Name=:");
		String name=sc.next();
		 
		if(id==2 && access==4000  && name.equals("Admin"))
			System.out.println("Access granted.");
		else
			System.out.println("Access Not Granted.");

	}

}


