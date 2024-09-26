
/* Assignment 2: Exam Grading System
*  Write a program that determines whether a student passes an exam based on three subjects.
*  A student passes if the average score is at least 60, and none of the individual scores is below 40.
*  Requirements:
*  •    Use logical operators && and || to combine conditions.*/


package Assignment_26;
import java.util.Scanner;
public class ExamGradingSystem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter the marks of 3 Subject:");
        double mark1=sc.nextDouble();
        double mark2=sc.nextDouble();
        double mark3=sc.nextDouble();
        
        double Avg=(mark1+mark2+mark3)/3;
        
        if(Avg>=60 && mark1>40 && mark2>40 && mark3>40)
        	System.out.println(" student pass..");
        else 
        	System.out.println("student Fail..");
	}

}
