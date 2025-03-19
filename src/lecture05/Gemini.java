package lecture05;

import java.util.Random;
import java.util.Scanner;

public class Gemini {

    public static void main(String[] args) {
        guessingGame();
//        double positiveNumber = getPositiveNumber();
//        System.out.println("You entered: " + positiveNumber);
//        countUpTo(5);
//        menuDriven();
    }

    public static void guessingGame() {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
        int guess = 0;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (guess != secretNumber) {
            try {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input from the buffer
            }
        }
    }

    public static double getPositiveNumber() {
        double number = 0;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!validInput) {
            try {
                System.out.print("Enter a positive number: ");
                number = scanner.nextDouble();
                if (number > 0) {
                    validInput = true;
                } else {
                    System.out.println("Number must be positive. Try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input from the buffer
            }
        }
        return number;
    }

    public static void countUpTo(int limit){
        if(limit <= 0){
            System.out.println("Limit must be greater than 0");
            return;
        }
        int count = 1;
        do{
            System.out.println(count);
            count++;
        }while(count <= limit);
    }

    public static void menuDriven() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");

            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Option 1 selected.");
                        // Perform action for option 1
                        break;
                    case 2:
                        System.out.println("Option 2 selected.");
                        // Perform action for option 2
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input from the buffer
                choice = 0; //reset choice to force loop to continue.
            }

        } while (choice != 3);
    }
}