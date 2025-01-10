/*
Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 
*/


public class Average{
	public static void main(String[] args){

		// create a variable to indicates maths, physics and chemistry mark
		int maths = 94, physics = 95, chemistry = 96;

		// create a variable to indicate average percent
		double averageMark = (maths + physics + chemistry)/3.0;

		// print the detail
		System.out.println("Sam's average mark in PCM is " + averageMark);

	}
} 
