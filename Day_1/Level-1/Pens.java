/*
Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
Hint => 
Use Modulus Operator (%) to find the reminder.
Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___
*/


public class Pens{
	public static void main(String[] args){

		// create a variable to indicate total number of pens
		int totalPens = 14;

		// create a variable to indicate total number of students
		int totalStudents = 3;

		// create a variable to indicate total number of pens
		int penDistributed = totalPens / totalStudents;

		// create a variable to indicate total number of remaining pens
		int remainingPens = totalPens % totalStudents;

		// print detail
		System.out.println("The Pen Per Student is " + penDistributed + " and the remaining pen not distributed is " + remainingPens);

	}
}