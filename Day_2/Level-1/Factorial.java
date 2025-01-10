/*
 * Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.

 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the user has entered a positive integer
        if (number >= 0) {
            // Initialize the factorial variable
            long factorial = 1;

            // Variable to keep track of the current number
            int i = 1;

            // Compute the factorial using a while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner
        input.close();
    }
}
