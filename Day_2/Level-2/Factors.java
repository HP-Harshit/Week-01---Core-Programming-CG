/*
 * Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number.
Run a for loop from i = 1 to i < number.
In each iteration of the loop, check if number is perfectly divisible by i.
If true, print the value of i.

 */

 import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("The factors of " + number + " are:");

        // Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                // Print the value of i
                System.out.println(i);
            }
        }

        // Close the scanner
        input.close();
    }
}
