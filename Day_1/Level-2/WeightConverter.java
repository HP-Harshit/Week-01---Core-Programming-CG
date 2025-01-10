/*
 * Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___

 */

 import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightPounds = input.nextDouble();

        // Convert the weight from pounds to kilograms
        double weightKilograms = weightPounds / 2.2;

        // Print the result
        System.out.println("The weight of the person in pounds is " + weightPounds + 
                           " and in kilograms is " + weightKilograms);

        // Close the scanner
        input.close();
    }
}
