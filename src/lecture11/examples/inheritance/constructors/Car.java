package lecture11.examples.inheritance.constructors;

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

    // Method to display car details
    public void displayCarDetails() {
        displayVehicleDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}