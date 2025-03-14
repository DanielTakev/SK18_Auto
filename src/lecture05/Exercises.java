package lecture05;

import java.util.Random;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        guessNumberGame();
    }

    public static void printLargestNumber() {
        int[] arr = {2, 11, 45, 9};
        //int[] arr = {-3, -5, -2, -4};
        //int[] arr = {-23, -1, -4, -5, 0};
        int largestNumber = arr[0];
        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }

        System.out.println("The largest number is: " + largestNumber);

        /*

            Solution without array

        int num1 = 2, num2 = 11, num3 = 45, num4 = 9;
        int largestNumber = num1;

        if (num2 > largestNumber) {
            largestNumber = num2;
        }
        if (num3 > largestNumber) {
            largestNumber = num3;
        }
        if (num4 > largestNumber) {
            largestNumber = num4;
        }
         */
    }

    public static void printDivisibleNumbers() {
        int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int num;

        for (int i = 0; i < list.length; i++) {
            num = list[i];
            if ((num % 5) == 0) {
                System.out.println(num);
                if (num > 150) {
                    break;
                }
            }
        }
    }

    public static void reverseList() {
        int[] list = {2, 11, 45, 9};

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
    }

    public static void guessNumberGame() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(1,100);

        // Variable to store user's guess
        int userGuess;

        // Use a do-while loop to ensure the user gets at least one chance to guess
        do {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess (between 1 and 100): ");
            userGuess = scanner.nextInt();

            // Check the user's guess against the number to guess
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
            }
        } while (userGuess != numberToGuess); // Continue until the correct guess

        // Close the scanner
        scanner.close();
    }

    public static void findFirstMultipleOfFive() {
        // Array of integers to search for a multiple of 5
        int[] numbers = {3, 7, 11, 10, 22, 45, 67};

        // Variable to store the first multiple of 5
        int firstMultipleOfFive = -1;

        // Iterate over the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            // Check if the current number is a multiple of 5
            if (numbers[i] % 5 == 0) {
                firstMultipleOfFive = numbers[i];
                break; // Exit the loop as soon as we find a multiple of 5
            }
        }

        // Check if a multiple of 5 was found
        if (firstMultipleOfFive != -1) {
            System.out.println("The first multiple of 5 in the array is: " + firstMultipleOfFive);
        } else {
            System.out.println("No multiple of 5 found in the array.");
        }
    }

    public static void printNonMultiplesOfThree() {
        // Array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Iterate over the array using a for loop
        for (int number : numbers) {
            // Check if the current number is a multiple of 3
            if (number % 3 == 0) {
                continue; // Skip the current iteration if it's a multiple of 3
            }

            // Print the number if it is not a multiple of 3
            System.out.println(number);
        }
    }

    public static void printAverageNumber() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to store the sum of numbers and count of numbers
        int sum = 0;
        int count = 0;
        int number;

        // Prompt the user to enter numbers
        System.out.println("Enter numbers to calculate the average. Enter 0 or a negative value to finish.");

        // Use a while loop to keep asking for numbers until a non-positive number is entered
        while (true) {
            // Read the next number from the user
            number = scanner.nextInt();

            // Check if the entered number is 0 or negative
            if (number <= 0) {
                break; // Exit the loop if a non-positive number is entered
            }

            // Add the number to the sum and increment the count
            sum += number;
            count++;
        }

        // Calculate and print the average
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average of the entered numbers is: " + average);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        // Close the scanner
        scanner.close();
    }
}