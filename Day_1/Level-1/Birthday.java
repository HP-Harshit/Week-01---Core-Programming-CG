/*
Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___
*/


public class Birthday{
	public static void main(String[] args){
		
		// create a variable to indicate the birth year
		int yearOfBirth = 2000;
		
		// create a variable to indicate the current year
		int currentYear = 2024;

		// create a variable to indicate the age of person
		int currentAge = currentYear - yearOfBirth;

		// Print the current age
		System.out.println("Harry's age in 2024 is " + currentAge);

	}
}