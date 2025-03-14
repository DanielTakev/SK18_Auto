package lecture09.exercises;

import java.util.ArrayList;

public class Student {
    // Attributes of the Student class
    String name;
    ArrayList<Double> grades;

    // Constructor to initialize the Student object
    public Student(String name, ArrayList<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    public static void main(String[] args) {
        // Creating a list of grades for each student
        ArrayList<Double> grades1 = new ArrayList<>();
        grades1.add(85.5);
        grades1.add(90.0);
        grades1.add(78.2);

        ArrayList<Double> grades2 = new ArrayList<>();
        grades2.add(92.4);
        grades2.add(88.7);
        grades2.add(94.1);

        ArrayList<Double> grades3 = new ArrayList<>();
        grades3.add(70.8);
        grades3.add(75.5);
        grades3.add(80.3);

        // Creating student objects
        Student student1 = new Student("Alice", grades1);
        Student student2 = new Student("Bob", grades2);
        Student student3 = new Student("Charlie", grades3);

        // Displaying each student's name along with their average grade
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }

    // Method to calculate and return the average of the grades
    public double calculateAverage() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to display the student's name and average grade
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println();
    }
}
