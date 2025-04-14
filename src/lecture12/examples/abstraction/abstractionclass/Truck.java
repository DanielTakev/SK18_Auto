package lecture12.examples.abstraction.abstractionclass;

public class Truck extends Vehicle {
    private int cargoCapacity;
    private int currentCargoLoad;

    public Truck(String brand, String model, int maxSpeed, int cargoCapacity) {
        super(brand, model, maxSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void inspect() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("Cargo Capacity: " + cargoCapacity);
        System.out.println("Current Cargo Load: " + currentCargoLoad);
        System.out.println("Registration Number: " + getRegNumber());
    }

    @Override
    public void drive() {
        if (isCargoLoaded()) {
            startEngine();
            accelerate(50);
            System.out.println("Driving the truck...");
        } else {
            System.out.println("Cannot drive. No cargo loaded.");
        }
    }

    public void loadCargo(int load) {
        if (currentCargoLoad + load <= cargoCapacity) {
            currentCargoLoad += load;
            System.out.println("Loaded " + load + " units of cargo. Current load: " + currentCargoLoad);
        } else {
            System.out.println("Cannot load " + load + " units. Exceeds cargo capacity.");
        }
    }

    public boolean isCargoLoaded() {
        return currentCargoLoad > 0;
    }
}