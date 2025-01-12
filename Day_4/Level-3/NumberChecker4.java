import java.util.Scanner;

public class NumberChecker4 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        // A prime number is greater than 1
        if (number <= 1) {
            return false;
        }
        // Check for factors other than 1 and itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        // Calculate the square of the number
        int square = number * number;
        // Calculate the sum of digits of the square
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        // Check if the sum of digits is equal to the number
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        // Calculate the sum and product of the digits
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        // Check if the sum of digits is equal to the product of digits
        return sumOfDigits == productOfDigits;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        // Calculate the square of the number
        int square = number * number;
        // Check if the square ends with the number itself
        while (number > 0) {
            if (number % 10 != square % 10) {
                return false;
            }
            number /= 10;
            square /= 10;
        }
        return true;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        // Check if the number is divisible by 7 or ends with 7
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrime(number);

        // Check if the number is a neon number
        boolean isNeon = isNeon(number);

        // Check if the number is a spy number
        boolean isSpy = isSpy(number);

        // Check if the number is an automorphic number
        boolean isAutomorphic = isAutomorphic(number);

        // Check if the number is a buzz number
        boolean isBuzz = isBuzz(number);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Is Prime: " + isPrime);
        System.out.println("Is Neon: " + isNeon);
        System.out.println("Is Spy: " + isSpy);
        System.out.println("Is Automorphic: " + isAutomorphic);
        System.out.println("Is Buzz: " + isBuzz);

        // Close the Scanner object
        input.close();
    }
}
