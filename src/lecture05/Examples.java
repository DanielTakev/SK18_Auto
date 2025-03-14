package lecture05;

public class Examples {
    public static void main(String[] args) {
        demoNestedLoop();
    }

    public static void demoForLoop() {
        for (int num = 10; num > 1; num--) {
            System.out.println("The value of i is:" + num);
        }
    }

    public static void demoNestedLoop() {
        int totalRows = 5;      // Total number of rows in the theater
        int seatsPerRow = 10;   // Total number of seats in each row

        // Outer loop for rows
        for (int row = 1; row <= totalRows; row++) {
            System.out.println("Checking Row " + row + ":");

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
        int num = 10;
        while (num > 1) {
            System.out.println(num);
            num--;
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
        int[] numbers = {3, 5, -12, 0, 24};
        for (int num : numbers) {
            System.out.println("number: " + num);
        }
    }

    public static void demoContinueStatement() {
        for (int num = 0; num <= 6; num++) {
            if (num == 4) {
                continue;
            }
            System.out.print(num + " ");
        }

    }

    public static void demoBreakStatement() {
        int num;
        for (num = 100; num >= 10; num--) {
            System.out.println("num: " + num);
            if (num == 99) {
                break;
            }
        }
        System.out.println("Out of for-loop");
    }
}