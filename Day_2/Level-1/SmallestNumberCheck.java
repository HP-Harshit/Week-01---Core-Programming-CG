/*
Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/

import java.util.Scanner;

public class SmallestNumberCheck {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Take user input for the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Take user input for the third number
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Print the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Close the scanner
        input.close();
    }
}
