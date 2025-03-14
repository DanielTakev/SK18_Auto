package lecture09;

public class Car {
    // Class attributes
    private String make;
    String model;
    int year;
    String color;
    double price;

    // No-argument constructor
    public Car() {
        this("Unknown", "Unknown", 2000, "Unpainted", 0.0);
    }

    // Constructor with make and model
    public Car(String make, String model) {
        this(make, model, 2000, "Unpainted", 0.0);
    }

    // Constructor with make, model, and year
    public Car(String make, String model, int year) {
        this(make, model, year, "Unpainted", 0.0);
    }

    // Constructor with make, model, year, and color
    public Car(String make, String model, int year, String color) {
        this(make, model, year, color, 10.0);
    }

    // Constructor with all attributes
    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Creating Car objects using different constructors
        Car car1 = new Car();
        Car car2 = new Car(null, "Corolla");
        Car car3 = new Car("Honda", "Civic", 2022);
        Car car4 = new Car("Ford", "Mustang", 2021, "Red");
        Car car5 = new Car("Tesla", "Model S", 2023, "White", 79999.99);

        // Displaying details of each car
        System.out.println("Car 1:");
        car1.displayDetails();
        System.out.println("\nCar 2:");
        car2.displayDetails();
        System.out.println("\nCar 3:");
        car3.displayDetails();
        System.out.println("\nCar 4:");
        car4.displayDetails();
        System.out.println("\nCar 5:");
        car5.displayDetails();
    }

    // Method to display car details
    public void displayDetails() {
        if (make != null) {
            System.out.println("Make: " + make);
        }
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }
}
