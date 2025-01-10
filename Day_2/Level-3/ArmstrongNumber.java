/*
Create a program to check if a number is Armstrong or not. Use the hints to show the steps clearly in the code
Hint => 
Armstrong Number is a number whose Sum of cubes of each digit results in the original number e.g. 153 = 1^3 + 5^3 + 3^3
Get an integer input and store it in the number variable define sum variable, initialize it to zero and originalNumber variable, and assign it to the input number variable
Use the while loop till the originalNumber is not equal to zero
In the while loop find the reminder number by using the modulus operator as in  number % 10. Find the cube of the number and add it to the sum variable
Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression. This romoves the last digit of the original number.
Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly
 */


import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input and store it in the number variable
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Initialize sum variable to zero and originalNumber variable to the input number
        int sum = 0;
        int originalNumber = number;

        // Use while loop till originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find the remainder (last digit) using the modulus operator
            int remainder = originalNumber % 10;

            // Find the cube of the remainder and add it to the sum variable
            sum += remainder * remainder * remainder;

            // Find the quotient of the number and assign it to originalNumber (remove the last digit)
            originalNumber /= 10;
        }

        // Check if the number is armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        input.close();
    }
}
