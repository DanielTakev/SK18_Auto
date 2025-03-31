package lecture08;

public class Overload {

    // Example 1: Overloading based on number of parameters
    public static int addToThings(int a, int b) {
        return a + b;
    }

    public static int addToThings(int a, int b, int c) {
        return a + b + c;
    }

    // Example 2: Overloading based on data type of parameters
    public static double addToThings(double a, double b) {
        return a + b;
    }

    public static String addToThings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 integers: " + addToThings(5, 10));
        System.out.println("Sum of 3 integers: " + addToThings(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + addToThings(5.5, 10.5));
        System.out.println("Concatenation of 2 Strings: " + addToThings("Hello, ", "World!"));
    }
}