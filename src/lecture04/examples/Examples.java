package lecture04.examples;


import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {

    displayCombinedResults(20, 5, 10, true);
    displayCombinedResults(15, 12, 8, false);
    displayCombinedResults(30, -3, 1, false);

//    int week = 11;
//        String day = "Sunday";
//        switch (day) {
//            case "Friday":
//                System.out.println("Friday ");
//                break;
//            case "Saturday":
//                System.out.println("Saturday ");
//                break;
//            case "Sunday":
//                System.out.println("Sunday ");
//                if (week == 11) {
//                    System.out.println("11 week!!!!!");
//                }
//                break;
//            case "Tuesday":
//                System.out.println("Tuesday ");
//                if (week == 11) {
//                    System.out.println("11 week!!!!!");
//                }
//                break;
//            default:
//                System.out.println("Default ");
//        }
//        // SAME
//        if (day == "Friday") {
//            System.out.println("Friday ");
//        } else if (day == "Saturday") {
//            System.out.println("Saturday ");
//        } else if (day == "Sunday") {
//            System.out.println("Sunday ");
//            if (week == 11) {
//                System.out.println("11 week!!!!!");
//            }
//        } else {
//            System.out.println("Default ");
//        }
    }

    public static void demoArithmeticOperations() {
        int productsCount = 100;
        int num2 = 200;
        int result = (productsCount + num2);
        System.out.println("productsCount + num2: " + result);
        System.out.println("productsCount - num2: " + (productsCount - num2)); // -100
        System.out.println("productsCount * num2: " + (productsCount * num2)); // 20000
        float divide = (productsCount / (float)num2);
        System.out.println("cast to float productsCount / num2 : " + divide);
        System.out.println("productsCount / num2: " + (productsCount / num2)); // 0
        System.out.println("productsCount % num2: " + (productsCount % num2)); // 100

        productsCount++; // 101
        num2--; // 199

        // Increases num2 after the result is calculated
        System.out.println(productsCount + num2++); // 101 + 199 = 300; num2 + 1 = 200

        // Increases num2 before the result is calculated
        System.out.println(productsCount + (++num2)); // 101 + (200 + 1) = 302
    }

    public static void demoAssignmentOperators() {
        int num1 = 10;
        int num2 = 20;
        System.out.println(num2);

        num2 = num1;
        System.out.println("= Output: " + num2);

        num2 += num1;
        System.out.println("+= Output: " + num2);

        num2 -= num1;
        System.out.println("-= Output: " + num2);

        num2 *= num1;
        System.out.println("*= Output: " + num2);

        num2 /= num1;
        System.out.println("/= Output: " + num2);

        num2 %= num1;
        System.out.println("%= Output: " + num2);
    }

    public static void demoComparisonOperators() {
        // Equal to (==)
        int a = 5;
        int b = 5;
        boolean isEqual = (a == b);
        System.out.println("a is equal to b: " + isEqual);

        // Not equal to (!=)
        int c = 3;
        int d = 7;
        boolean isNotEqual = (c != d);
        System.out.println("c is not equal to d: " + isNotEqual);

        // Greater than (>)
        int e = 10;
        int f = 8;
        boolean isGreater = (e > f);
        System.out.println("e is greater than f: " + isGreater);

        // Less than (<)
        int g = 4;
        int h = 6;
        boolean isLess = (g < h);
        System.out.println("g is less than h: " + isLess);

        // Greater than or equal to (>=)
        int i = 7;
        int j = 7;
        boolean isGreaterOrEqual = (i >= j);
        System.out.println("i is greater than or equal to j: " + isGreaterOrEqual);

        // Less than or equal to (<=)
        int k = 5;
        int l = 10;
        boolean isLessOrEqual = (k <= l);
        System.out.println("k is less than or equal to l: " + isLessOrEqual);
    }

    public static void demoLogicalOperator() {
        boolean isAdult = true;
        boolean hasSubscriptionPaid = false;

        System.out.println("isAdult && hasSubscriptionPaid: " + (isAdult && hasSubscriptionPaid));
        System.out.println("isAdult || hasSubscriptionPaid: " + (isAdult || hasSubscriptionPaid));
        System.out.println("!(isAdult && hasSubscriptionPaid): " + !(isAdult && hasSubscriptionPaid));
    }

    public static void demoOperatorPrecedence() {
        // Example 1: Multiplication and Addition
        int result1 = 2 + 3 * 4; // Multiplication (*) has higher precedence than addition (+)
        System.out.println("Result of 2 + 3 * 4: " + result1);

        // Example 2: Parentheses to change precedence
        int result2 = (2 + 3) * 4; // Parentheses change the order of operations
        System.out.println("Result of (2 + 3) * 4: " + result2);

        // Example 3: Division and Addition
        int result3 = 10 + 20 / 5; // Division (/) has higher precedence than addition (+)
        System.out.println("Result of 10 + 20 / 5: " + result3);

        // Example 4: Modulus and Subtraction
        int result4 = 15 % 4 - 2; // Modulus (%) has higher precedence than subtraction (-)
        System.out.println("Result of 15 % 4 - 2: " + result4);

        // Example 5: Relational and Logical AND
        boolean isTrue1 = 5 > 2 && 3 < 4; // Relational (>, <) has higher precedence than logical AND (&&)
        System.out.println("Result of 5 > 2 && 3 < 4: " + isTrue1);

        // Example 6: Logical OR and AND
        boolean isTrue2 = true || false && false; // Logical AND (&&) has higher precedence than OR (||)
        System.out.println("Result of true || false && false: " + isTrue2);

        // Example 7: Assignment with Arithmetic
        int a = 5;
        int result5 = a += 3 * 2; // Multiplication (*) has higher precedence than assignment (+=)
        System.out.println("Result of a += 3 * 2: " + result5);
    }

    public static void demoIfStatement() {
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();

        System.out.println("Start!");
        if (num < 100) {
            System.out.println("number is less than 100");
            int nextInt = myScanner.nextInt();

            if (nextInt == 3) {
                System.out.println("nextInt is equal to 3");
            }
        } else {
            System.out.println("ELSE!");
        }
        System.out.println("END!");
    }

    public static void demoNestedIfStatement() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int alaBala = 0;
        if (num != 10) {
            alaBala = 11;
            System.out.println(alaBala);
        }

        if (num < 100) {
            alaBala = 1123;
            System.out.println("number is less than 100");
            if (num > 50) {
                System.out.println("number is greater than 50");
            }
        }
        System.out.println(alaBala);
    }

    public static void demoIfElseStatement() {
        int num = 120;
        if (num < 50) {
            System.out.println("num is less than 50");
        } else {
            System.out.println("num is greater than or equal 50");
        }
    }

    public static void demoIfElseIfStatement() {
        int num = 14;

        if (num < 100 && num >= 10) {
            System.out.println("Its a two digit number");
        } else if (num < 1000 && num >= 100) {
            System.out.println("Its a three digit number");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("Its a four digit number");
        } else {
            System.out.println("number is not between 10 & 99999");
        }
    }

    public static void demoSwitchStatement() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Case1 ");
                break;
            case 2:
                System.out.println("Case2 ");
                break;
            case 3:
                System.out.println("Case3 ");
                break;
            default:
                System.out.println("Default ");
        }
    }

    public static void displayCombinedResults(int age, int num1, int num2, boolean isRaining) {
        String status = (age >= 18) ? "Adult" : "Minor";
        int max = (num1 > num2) ? num1 : num2;
        String activity = isRaining ? "Stay inside" : "Go outside";

        System.out.println("Age: " + age + ", Status: " + status + ", Max(num1, num2): " + max + ", Activity: " + activity);
    }
}