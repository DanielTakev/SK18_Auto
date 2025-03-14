package lecture11.examples.polymorphism;

public class Truck extends Vehicle {
    int cargoCapacity;

    // Constructor for Truck
    public Truck(String brand, String model, int maxSpeed, int cargoCapacity) {
        super(brand, model, maxSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    // Additional method specific to Truck
    public void loadCargo() {
        System.out.println("Loading cargo into the truck...");
    }

    // Overriding displayDetails method for Truck
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call parent class method
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }

    // Overriding performMaintenance method for Truck
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the truck, including checking the cargo hold and brakes.");
    }
}