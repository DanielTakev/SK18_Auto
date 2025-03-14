package lecture02.examples;

import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {
        demoScanner();
    }

    public static void demoDataTypes() {
        // Primitive data types
        byte byteValue = 100;
        short shortValue = 20000;
        int intValue = 1234567890;
        long longValue = 1234567890123456789L;
        float floatValue = 3.14f;
        System.out.println(floatValue);
        double doubleValue = 3.141592653589793;
        char charValue = 'A';
        boolean booleanValue = true;
        // Non-primitive data type
        String stringValue = "Hello, World!"; // Example of String
        //...Any types that are created by the programmer and are not predefined by the language
    }
    public static void demoVariables() {
        //Specify the Data Type: Always declare the data type of the variable.
        int age;
        double salary;
        //Use Meaningful Names: Choose variable names that clearly describe the data they store.
        int numberOfStudents;
        double accountBalance;
        //Initialize Before Use: Make sure to initialize variables before using them in expressions or operations.
        int dayLimit = 25;
        //Follow Naming Conventions: Use camelCase for variable names.
        int userAge;
        double annualSalary;
        //Start with a Letter or Underscore: Variable names must begin with a letter or an underscore.
        int _score;
        int accessLevel;
       /*
        What You Should Not Do When Declaring Variables!!!
        Do Not Use Reserved Words: Avoid using Java reserved words (keywords) as variable names.
        int int; // Incorrect
        Do Not Start with a Digit: Variable names should not start with a number.
        int 1stPlace; // Incorrect
        Do Not Include Spaces: Variable names should not contain spaces.
        int first name; // Incorrect
        Avoid Special Characters: Do not use special characters other than an underscore (_).
        int user-name; // Incorrect
        Do Not Use Single Letters (Unless Clear): Avoid using single-letter names unless their meaning is clear and commonly understood (e.g., i for loop counters).
        int x; // Not recommended unless contextually clear
        */
    }
    public static void demoDataTypesCasting() {
        /*
        Implicit Casting (Widening)
        Implicit casting is done automatically when converting a smaller type to a larger type size
         */
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);    // Outputs 9
        System.out.println(myDouble); // Outputs 9.0
        /*
        Explicit Casting (Narrowing)
        Explicit casting must be done manually when converting a larger type to a smaller type size
         */
        myDouble = 9.78;
        myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt);    // Outputs 9
    }

    public static void demoScanner() {
        Scanner scanner = new Scanner(System.in);
        // String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // Integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        // Double input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        // Boolean input
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        // Output the input values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Student: " + isStudent);
        // Close the scanner
        scanner.close();
    }
}