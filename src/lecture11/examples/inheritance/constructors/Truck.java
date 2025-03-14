package lecture11.examples.inheritance.constructors;

public class Truck extends Vehicle {
    int cargoCapacity;

    // Constructor for Truck
    public Truck(String brand, String model, int maxSpeed, int cargoCapacity) {
        super(brand, model, maxSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    // Method to display truck details
    public void displayTruckDetails() {
        displayVehicleDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }

    // Additional method specific to Truck
    public void loadCargo() {
        System.out.println("Loading cargo into the truck...");
    }
}