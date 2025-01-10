/*
Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/



import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate the length of the side of the square
        double side = perimeter / 4.0;

        // Print the result
        System.out.println("The length of the side is " + side + 
                           " whose perimeter is " + perimeter);

        // Close the scanner
        input.close();
    }
}
