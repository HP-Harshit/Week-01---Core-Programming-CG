import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker5 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        // Count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        // Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        // Find the greatest factor in the array
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        // Sum the factors in the array
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        // Multiply the factors in the array
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        // Multiply the cubes of the factors in the array
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        // Sum the factors excluding the number itself
        int sum = sumOfFactors(factors) - number;
        // Check if the sum is equal to the number
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        // Sum the factors excluding the number itself
        int sum = sumOfFactors(factors) - number;
        // Check if the sum is greater than the number
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        // Sum the factors excluding the number itself
        int sum = sumOfFactors(factors) - number;
        // Check if the sum is less than the number
        return sum < number;
    }

    // Helper method to calculate factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        // Calculate the factorial of the digit
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        // Calculate the sum of the factorials of the digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        // Check if the sum is equal to the number
        return sum == number;
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Find the greatest factor of the number
        int greatestFactor = findGreatestFactor(factors);

        // Find the sum of the factors
        int sumFactors = sumOfFactors(factors);

        // Find the product of the factors
        int productFactors = productOfFactors(factors);

        // Find the product of the cubes of the factors
        double productCubesFactors = productOfCubesOfFactors(factors);

        // Check if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number);

        // Check if the number is an abundant number
        boolean isAbundant = isAbundantNumber(number);

        // Check if the number is a deficient number
        boolean isDeficient = isDeficientNumber(number);

        // Check if the number is a strong number
        boolean isStrong = isStrongNumber(number);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sumFactors);
        System.out.println("Product of Factors: " + productFactors);
        System.out.println("Product of Cubes of Factors: " + productCubesFactors);
        System.out.println("Is Perfect Number: " + isPerfect);
        System.out.println("Is Abundant Number: " + isAbundant);
        System.out.println("Is Deficient Number: " + isDeficient);
        System.out.println("Is Strong Number: " + isStrong);

        // Close the Scanner object
        input.close();
    }
}
