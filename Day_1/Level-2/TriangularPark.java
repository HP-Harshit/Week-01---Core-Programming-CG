/*
 * An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km
 */


 import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the lengths of the sides of the triangle in meters
        System.out.print("Enter the length of side1 (meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of side2 (meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length of side3 (meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Calculate the number of rounds needed to complete 5 km (5000 meters)
        double distanceToRun = 5000; // distance in meters
        double rounds = distanceToRun / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

        // Close the scanner
        input.close();
    }
}
