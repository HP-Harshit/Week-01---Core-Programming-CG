/*
Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 0.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
*/

public class Distance{
	public static void main(String[] args){

		// create a variable to indicate distance in kilometer
		double kilometer = 10.8;

		// create a variable to indicate distance in miles
		double miles = kilometer * 0.621371;

		// Print the detail
		System.out.println("The distance " + kilometer + "km in miles is " + miles);

	}
}