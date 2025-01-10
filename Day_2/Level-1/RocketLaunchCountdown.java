/*
 * Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint => 
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter.
 */


 import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        // Perform the countdown using a while loop
        while (counter >= 1) {
            // Print the value of the counter
            System.out.println(counter);

            // Decrement the counter
            counter--;
        }

        // Close the scanner
        input.close();
    }
}
