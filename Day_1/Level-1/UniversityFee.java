/*
Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___
*/


import java.util.Scanner;

public class University {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the student fee
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();

        // Take user input for the discount percentage
        System.out.print("Enter the discount percentage (%): ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = fee * (discountPercent / 100.0);

        // Calculate the final fee to pay after discount
        double feeToPay = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount + 
                           " and the final discounted fee is INR " + feeToPay);
        
        // Close the scanner
        input.close();
    }
}