/*
 * Create a program to find all the multiple of a number taken as user input below 100.
Hint => 
Get input value for a variable named number.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number.
If true, print the number and continue the loop.
 */

import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");

        // Run a for loop backward from i = 100 to i = 1
        for (int i = 100; i >= 1; i--) {
            // Check if i perfectly divides the number
            if (i % number == 0) {
                // Print the value of i
                System.out.println(i);
            }
        }

        // Close the scanner
        input.close();
    }
}
