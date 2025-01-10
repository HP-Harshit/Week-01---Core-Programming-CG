/*
 * Create a program to swap two numbers 
Hint => 
Create a variable number1 and take user input.
Create a variable number2 and take user input.
Swap number1 and number2  and print the swapped output
I/P => number1, number2
O/P => The swapped numbers are  ___ and ___
 */


import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the first number
        System.out.print("Enter the first number (number1): ");
        int number1 = input.nextInt();

        // Take user input for the second number
        System.out.print("Enter the second number (number2): ");
        int number2 = input.nextInt();

        // Swap the numbers using bitwise XOR
        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        // Print the swapped values
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // Close the scanner
        input.close();
    }
}
