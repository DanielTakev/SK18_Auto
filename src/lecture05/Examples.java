package lecture05;

import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {
        demoBreakStatement();
    }

    public static void demoForLoop() {
        int innerNum = 1;

        for (int num = 10; num > 1; num--) {
            System.out.println("The value of NUM is: " + num);
            innerNum++;
            System.out.println(innerNum);
        }
    }

    public static void demoNestedLoop() {
        int totalRows = 5;      // Total number of rows in the theater
        int seatsPerRow = 10;   // Total number of seats in each row

        // Outer loop for rows
        for (int row = 1; row <= totalRows; row++) {
            System.out.println("Checking Row " + row + ":");
            // Check for seats -> seatsPerRow = X
            // Inner loop for seats in each row
            for (int seat = 1; seat <= seatsPerRow; seat++) {
                // Simulate checking each seat
                System.out.println("  Checking Seat " + seat + " in Row " + row);
            }

            // New line for better readability
            System.out.println();
        }
    }

    public static void demoWhileLoop() {
        System.out.println("Enter integer: ");
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        while (num > 0) {
            System.out.println("Still available seats.");
            System.out.println(num);
            num--;
            if (num == 1) {
                System.out.println("This is the last seat!!!!!");
            }
        }
    }

    public static void demoDoWhileLoop() {
        int num = 10;
        do {
            System.out.println(num);
            num--;
        } while (num > 1);

    }

    public static void demoForEachLoop() {
        int[] numbers = {3, 5, -12, 0, 24, -44, 11};
        // Test comment
        for (int myNumIntoArray : numbers) {
            System.out.println("number in for-each: " + myNumIntoArray);
        }

        System.out.println("length: " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers in for: " + numbers[i]);
        }
    }

    public static void demoContinueStatement() {
        for (int num = 0; num <= 6; num++) {
            if (num == 2) {
                System.out.print("You don't pass! Next time, sorry!");
                continue;
            }
            System.out.println("You pass!");
            System.out.println(num + " ");
        }
    }

    public static void demoBreakStatement() {
        int num;
        for (num = 100; num >= 10; num--) {
            System.out.println("num: " + num);
            if (num == 98) {
                break;
            }
        }
        System.out.println("Out of for-loop: " + num);
    }
}