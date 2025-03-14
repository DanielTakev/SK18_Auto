package lecture12.examples.encapsulation.modifiers;


import lecture12.examples.encapsulation.modifiers.vehicle.Vehicle;

public class Truck extends Vehicle {
    private int cargoCapacity;

    // Constructor for Truck
    public Truck(String brand, String model, int maxSpeed, int cargoCapacity) {
        super(brand, model, maxSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    public void inspectTruck() {
        // This field is accessible because it is public
        System.out.println("Registration Number: " + regNumber);

        // This field is accessible because it is protected and Truck is a subclass of Vehicle even though it is in a different package
        System.out.println("Max Speed: " + maxSpeed);

        // This field is not accessible because it is package-private and Truck is in a different package
        //System.out.println("Current Speed: " + currentSpeed);

        // This field is not accessible because it is private
        // System.out.println("Brand: " + super.brand);

        // This field is not accessible because it is private
        // System.out.println("Model: " + super.model);

        // This field is accessible because is private and is in the scope of the class
        System.out.println("Cargo Capacity: " + cargoCapacity);
    }

    public void driveTruck() {
        super.startEngine(); // This method is accessible because it is public
        super.accelerate(50); // This method is accessible because it is protected and Truck is a subclass of Vehicle even though it is in a different package
        // super.stopEngine(); // This method is not accessible because it is package-private
        System.out.println("Driving the truck...");
    }
}