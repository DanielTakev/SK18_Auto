package lecture02.exercises;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        float a;
        //
        //

//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter side a size: ");
//        a = myObj.nextFloat();
//        System.out.println("Enter side b size: ");
//        float b = myObj.nextFloat();
//        System.out.println("Enter side c size: ");
//        float c = myObj.nextFloat();
//        float perimeter = a + b + c;
//        System.out.println("Triangle Perimeter is: " + perimeter);

        convertMinutesToYearsDays();
    }

    public static void printName() {
        String firstName = "Daniel";
        String middleName = "Emilov";
        String lastName = "Takev";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
    }

    public static void printTrianglePerimeter() {
        float a = 3.5F;
        float b = 5.5F;
        float c = 5.5F;
        float perimeter = a + b + c;
        System.out.println("Triangle Perimeter is: " + perimeter);
    }

    public static void printTriangleArea() {
        float a = 5.1F;
        float h = 2.4F;
        float triangleArea = (a * h) / 2;
        System.out.println("The area of triangle is: " + triangleArea);
    }

    public static void printPineTree() {
        char asterisk = '*';
        System.out.println("     " + asterisk);
        System.out.println("    " + asterisk + " " + asterisk);
        System.out.println("   " + asterisk + " " + asterisk + " " + asterisk);
    }

    public static void printTrianglePerimeterInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter side a size: ");
        float a = myObj.nextFloat();
        System.out.println("Enter side b size: ");
        float b = myObj.nextFloat();
        System.out.println("Enter side c size: ");
        float c = myObj.nextFloat();
        float perimeter = a + b + c;
        System.out.println("Triangle Perimeter is: " + perimeter);
    }

    public static void printTriangleAreaInput() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter side a size: ");
        float a = myScanner.nextFloat();
        System.out.println("Enter h size: ");
        float h = myScanner.nextFloat();
        float area = (a * h) / 2;
        System.out.println("The area of the triangle is: " + area);
    }

    public static void convertMinutesToYearsDays() {
        byte minutesInHour = 60;
        byte hoursInDay = 24;
        short daysInYear = 365;
        int minutesInYear = minutesInHour * hoursInDay * daysInYear;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double min = input.nextLong();
        double years = (min / minutesInYear);
        double days = (min / minutesInHour / hoursInDay) % daysInYear;
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
