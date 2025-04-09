package lecture11.examples.inheritance.constructors;

// Parent class: Vehicle
public class Vehicle {
    public String brand;
    public String model;
    public int maxSpeed;

    // Constructor for Vehicle class
    public Vehicle(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to start the engine
    public void startEngine() {
        System.out.println(brand + " engine started. Max speed: " + maxSpeed + " km/h");
    }

    // Method to stop the engine
    public void stopEngine() {
        System.out.println(brand + " engine stopped.");
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Make: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed);
    }
}