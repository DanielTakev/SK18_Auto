package lecture04.exercises;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        convertTemperature();
    }

    public static void buildTriangle() {
        float angle1, angle2, angle3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for first angle:");
        angle1 = scanner.nextFloat();
        System.out.println("Enter value for second angle:");
        angle2 = scanner.nextFloat();
        System.out.println("Enter value for third angle:");
        angle3 = scanner.nextFloat();

        String validMessage = "The triangle can be build! The type of the triangle is: ";

        float sumOfAngles = angle1 + angle2 + angle3;

        if (sumOfAngles != 180) {
            System.out.println("The triangle cannot be build!");
        } else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println(validMessage + "Equilateral");

        } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println(validMessage + "Right-angled");

        } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
            System.out.println(validMessage + "Obtuse");

        } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
            System.out.println(validMessage + "Acute");

        } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
            System.out.println(validMessage + "Isosceles");

        } else {
            System.out.println(validMessage + "Multifaceted");

        }
    }

    public static void printWeekDay() {
        System.out.println("Please enter a day of the week:");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("The " + day + "-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + day + "-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The " + day + "-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + day + "-th day of the week is Tuesday");
                break;
            case 5:
                System.out.println("The " + day + "-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + day + "-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + day + "-th day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid day:" + day + " Please select a day between 1-7");
        }
    }

    public static void isPersonEligibleToWork() {
        String eligibleToWorkMessage = "You are eligible to work";
        String notEligibleToWorkMessage = "You are NOT eligible to work";

        System.out.println("Please enter your age:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 16) {
            if (age > 67) {
                System.out.println(notEligibleToWorkMessage);
            } else {
                System.out.println(eligibleToWorkMessage);
            }
        } else {
            System.out.println(notEligibleToWorkMessage);
        }
    }

    public static void calculateRevenue() {
        double revenue;
        double unitPrice;
        int quantity;
        double discountRate;
        double discount;
        String revenueMessage = "The revenue from sale: ";
        String discountMessage = "Discount: ";
        char dollar = '$';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter unit price:");
        unitPrice = scanner.nextDouble();

        System.out.println("Please enter quantity:");
        quantity = scanner.nextInt();

        revenue = unitPrice * quantity;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.20;
        } else {
            discountRate = 0;
        }

        discount = revenue * discountRate;
        revenue = revenue - discount;

        System.out.println(revenueMessage + revenue + dollar);
        System.out.println(discountMessage + discount + dollar);
    }

    public static void planVacation() {
        String vacationType;
        double budget;
        double dailyBudget;
        int people;
        int days;
        String bulgariaDestinationMessage = "Available destination: Bulgaria";
        String nonBulgariaDestinationMessage = "Available destination: Outside Bulgaria";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter vacation type:");
        vacationType = scanner.nextLine();

        System.out.println("Please enter number of days:");
        days = scanner.nextInt();

        System.out.println("Please enter number of people:");
        people = scanner.nextInt();

        System.out.println("Please enter your budget:");
        budget = scanner.nextDouble();

        dailyBudget = budget / (days * people);

        switch (vacationType) {
            case "Beach":
                if (dailyBudget < 50) {
                    System.out.println(bulgariaDestinationMessage);
                } else {
                    System.out.println(nonBulgariaDestinationMessage);
                }
                break;
            case "Mountain":
                if (dailyBudget < 30) {
                    System.out.println(bulgariaDestinationMessage);
                } else {
                    System.out.println(nonBulgariaDestinationMessage);
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation!");
        }
    }

    public static void isYearLeap() {
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        // Print the result
        if (isLeapYear) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        // Close the scanner
        scanner.close();
    }

    public static void convertTemperature() {
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a temperature
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Prompt the user to choose the conversion direction
        System.out.print("Convert to (1) Fahrenheit or (2) Celsius? Enter 1 or 2: ");
        int choice = scanner.nextInt();

        // Perform the conversion based on the user's choice using a switch statement
        switch (choice) {
            case 1:
                // Convert Celsius to Fahrenheit
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                // Convert Fahrenheit to Celsius
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            default:
                // Handle invalid input
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }
    }
}