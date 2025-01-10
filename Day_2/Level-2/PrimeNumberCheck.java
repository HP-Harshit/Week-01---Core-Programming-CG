/*
 * Write a Program to check if the given number is a prime number or not
Hint => 
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
Use isPrime boolean variable to store the result

 */

 import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize the isPrime variable
        boolean isPrime = true;

        // Check if the number is greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop through all the numbers from 2 to the user input number
            for (int i = 2; i < number; i++) {
                // Check if the remainder is zero
                if (number % i == 0) {
                    // The number is divisible by some other number, so it's not a prime number
                    isPrime = false;
                    break;
                }
            }
        }

        // Print if the number is prime
        if (isPrime) {
            System.out.println("The number " + number + " is a prime number.");
        } else {
            System.out.println("The number " + number + " is not a prime number.");
        }

        // Close the scanner
        input.close();
    }
}
