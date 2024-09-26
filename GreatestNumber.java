
/* Assignment 8: Determine the Greatest Number Using Ternary Operator

* Write a Java program to find the greatest number among three numbers using the ternary operator.

*Input: Three integer numbers from the user.
*Output: The greatest number among the three entered numbers.*/

package Assignment_26;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		System.out.println("Enter num3:");
		int num3=sc.nextInt();
		
		
		int largest= num3 > ( num1 > num2 ? num1 : num2) ? num3 : ( num1 > num2 ? num1 : num2 );
		 
		System.out.println("large number:"+largest);
	}

}
