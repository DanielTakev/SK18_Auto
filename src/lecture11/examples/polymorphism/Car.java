package lecture11.examples.polymorphism;

// Subclass: Car, which extends Vehicle
public class Car extends Vehicle {
    public int numberOfDoors;
    public String fuelType;

    // Constructor for Car class using super to call parent class constructor
    public Car(String brand, String model, int maxSpeed, int numberOfDoors, String fuelType) {
        super(brand, model, maxSpeed);  // Calling the constructor of the parent class (Vehicle)
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    // Method to play music (specific to Car)
    public void playMusic() {
        System.out.println(super.brand + " is playing music.");
    }

    // Method to open the trunk (specific to Car)
    public void openTrunk() {
        System.out.println(super.brand + " trunk is open.");
    }

    // Overriding displayDetails method for Car
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call parent class method
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }

    // Overriding performMaintenance method for Car
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the car, including oil change and tire rotation.");
    }
}