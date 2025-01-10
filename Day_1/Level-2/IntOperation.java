/*
Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => a, b, and c
O/P => The results of Int Operations are —-, -—, and —-
*/


import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the first integer (a)
        System.out.print("Enter the first integer (a): ");
        int a = input.nextInt();

        // Take user input for the second integer (b)
        System.out.print("Enter the second integer (b): ");
        int b = input.nextInt();

        // Take user input for the third integer (c)
        System.out.print("Enter the third integer (c): ");
        int c = input.nextInt();

        // Calculate the integer operations
        int operation1 = a + b * c;    // Multiplication has higher precedence than addition
        int operation2 = a * b + c;    // Multiplication has higher precedence than addition
        int operation3 = c + a / b;    // Division has higher precedence than addition
        int operation4 = a % b + c;    // Modulus has higher precedence than addition

        // Print the results
        System.out.println("The results of Int Operations are " + operation1 + ", " 
                           + operation2 + ", " + operation3 + ", and " + operation4);

        // Close the scanner
        input.close();
    }
}
