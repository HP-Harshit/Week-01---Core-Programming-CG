/*
Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
*/

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Take user input for the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Calculate the quotient
        int quotient = number1 / number2;

        // Calculate the remainder
        int remainder = number1 % number2;

        // Print the results
        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder + 
                           " of two numbers " + number1 + " and " + number2);

        // Close the scanner
        input.close();
    }
}
