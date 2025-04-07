package lecture10.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        calculateSquareRoot("src/com/example/autocourse/lecture10/number1.txt");
    }

    /**
     * Prompts the user to enter an integer and handles any input errors.
     * Keeps prompting until a valid integer is entered.
     *
     * @return A valid integer input from the user.
     * <p>
     * **Test Cases:**
     * - **Positive Input:** If the user enters `42`, the method should return `42`.
     * - **Negative Input:** If the user enters `abc`, the method should display "That's not a valid integer. Please try again." and continue to prompt for input until a valid integer is entered.
     */
    public static int getValidIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter an integer: ");
            try {
                userInput = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        return userInput;
    }


    /**
     * Reads an integer from a specified file, computes its square root, and handles any errors that occur.
     * It processes the integer from the file and prints the square root of that integer.
     *
     * @param filename The name of the file from which to read the integer.
     *                 <p>
     *                 **Test Cases:**
     *                 - **Valid Input:** If the file `number.txt` contains `25`, the method will print "The square root of 25 is 5.0".
     *                 - **File Not Found:** If the file `number.txt` does not exist, the method will print "Error: The file was not found."
     *                 - **Invalid Content:** If the file `number.txt` contains non-integer content like `hello`, the method will print "Error: The file does not contain a valid integer."
     */
    public static void calculateSquareRoot(String filename) {
        Scanner scanner = null;
        try {
            // Create a Scanner object to read from the file
            scanner = new Scanner(new File(filename));
            // Read the integer from the file
            int number = scanner.nextInt();
            // Compute the square root
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is " + squareRoot);
        }
        // Handle case where the file is not found
        catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");
        }
        // Handle case where the content of the file is not a valid integer
        catch (InputMismatchException e) {
            System.out.println("Error: The file does not contain a valid integer.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    /**
     * Validates the given age to ensure it is within the valid range (0 to 120).
     * Throws an IllegalArgumentException if the age is out of range.
     *
     * @param age The age to validate.
     * @throws IllegalArgumentException If the age is less than 0 or greater than 120.
     *                                  <p>
     *                                  **Test Cases:**
     *                                  - **Valid Age:** If the age is `25`, the method completes without errors.
     *                                  - **Negative Age:** If the age is `-5`, the method throws an `IllegalArgumentException` with the message "Error: Age must be between 0 and 120."
     *                                  - **Age Too High:** If the age is `130`, the method throws an `IllegalArgumentException` with the message "Error: Age must be between 0 and 120."
     */
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Error: Age must be between 0 and 120.");
        }
    }

    /**
     * Processes the user's age by validating it and handling any exceptions thrown.
     * Prints an error message if the age is invalid.
     *
     * @param age The age to process.
     */
    public static void processUserAge(int age) {
        try {
            validateAge(age);
            System.out.println("The age " + age + " is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}