/*
 * Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
Spring Season is from March 20 to June 20

 */



 import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the month
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        // Take user input for the day
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Check if the date falls within the Spring Season
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close the scanner
        input.close();
    }
}
