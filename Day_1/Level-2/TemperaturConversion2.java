/*
 * Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
Hint => 
Create a fahrenheit variable and take the user's input
User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The ____ fahrenheit is _____ celsius
 */


 import java.util.Scanner;

public class TemperaturConversion2 {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert the temperature from Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5/9;

        // Print the result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius.");

        // Close the scanner
        input.close();
    }
}
