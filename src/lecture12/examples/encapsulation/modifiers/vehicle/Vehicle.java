package lecture12.examples.encapsulation.modifiers.vehicle;

// Parent class: Vehicle
public class Vehicle {
    public String regNumber;     // Public variable
    protected int maxSpeed;       // Protected variable
    int currentSpeed;             // Default (package-private) variable
    private String brand;          // Public variable
    private String model;         // Private variable
    private double fuelConsumption;

    // Constructor for Vehicle class
    public Vehicle(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    // Public method
    public void startEngine() {
        System.out.println(brand + " " + model + " engine started.");
    }

    // Private method to update fuel consumption
    private void updateFuelConsumption(int increment) {
        fuelConsumption += increment * 0.05;
    }

    // Protected method
    protected void accelerate(int increment) {
        if (currentSpeed + increment <= maxSpeed) {
            currentSpeed += increment;
            updateFuelConsumption(increment);
            System.out.println(brand + " " + model + " accelerated to " + currentSpeed + " km/h. Fuel consumption: " + fuelConsumption + " L/100km");
        } else {
            currentSpeed = maxSpeed;
            System.out.println(brand + " " + model + " is at max speed: " + maxSpeed + " km/h");
        }
    }

    // Default (package-private) method
    void stopEngine() {
        System.out.println(brand + " " + model + " engine stopped.");
    }
}