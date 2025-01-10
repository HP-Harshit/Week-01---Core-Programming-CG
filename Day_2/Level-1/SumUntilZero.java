/*
 * Write a program to find the sum of numbers until the user enters 0
Hint => 
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value

 */

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Initialize the total variable
        double total = 0.0;

        // Variable to store the user-entered value
        double userInput;

        // User enter the first input
        System.out.print("Enter a number (enter 0 to stop): ");
        userInput = input.nextDouble();

        // Loop to continue until the user enters 0
        while (userInput != 0) {
            // Add the user input to the total
            total += userInput;

            // Enter the next input
            System.out.print("Enter a number (enter 0 to stop): ");
            userInput = input.nextDouble();
        }

        // Print the total value
        System.out.println("The total sum is " + total);

        // Close the scanner
        input.close();
    }
}
