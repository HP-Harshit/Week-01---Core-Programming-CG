/*
 * Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it

 */

 import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for ages
        System.out.print("Enter the age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = input.nextInt();

        // Take user input for heights
        System.out.print("Enter the height of Amar (in cm): ");
        double heightAmar = input.nextDouble();
        System.out.print("Enter the height of Akbar (in cm): ");
        double heightAkbar = input.nextDouble();
        System.out.print("Enter the height of Anthony (in cm): ");
        double heightAnthony = input.nextDouble();

        // Finding the youngest friend
        String youngestFriend;
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Finding the tallest friend
        String tallestFriend;
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Print the results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm");

        // Close the scanner
        input.close();
    }
}
