
/* Assignment 7: Weather Conditions
* Write a program that determines whether it's safe to go outside based on temperature and weather conditions. 
*     The conditions to go outside are:
* •    Temperature should be between 20°C and 30°C.
* •    It should not be raining.
* Requirements:
* •    Use logical operators && and !.*/


package Assignment_26;
import java.util.Scanner;
public class WeatherCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Temprature:");
		float temp=sc.nextFloat();
		boolean rain=false;
		
		if(temp>=20 && temp<=30 && !rain)
		System.out.println("it's safe to go outside.");
		
		else
			System.out.println("it's not safe to go outside");

	}

}
