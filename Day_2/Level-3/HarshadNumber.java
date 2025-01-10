/*
 * Create a program to check if a number taken from the user is a Harshad Number.
Hint => 
A Harshad number is an integer which is divisible by the sum of its digits. 
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to sum.
Check if the number is perfectly divisible by the sum.
If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.

 */


 import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input for the number variable
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Initialize the sum variable to 0
        int sum = 0;
        int originalNumber = number;

        // Create a while loop to access each digit of the number
        while (originalNumber != 0) {
            // Find the remainder (last digit) using the modulus operator
            int remainder = originalNumber % 10;

            // Add the digit to the sum variable
            sum += remainder;

            // Remove the last digit from the original number
            originalNumber /= 10;
        }

        // Check if the number is perfectly divisible by the sum
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        // Close the scanner
        input.close();
    }
}
