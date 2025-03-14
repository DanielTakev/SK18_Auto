package lecture12.examples.abstraction.abstractionclass;

public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean allDoorsClosed;

    public Car(String brand, String model, int maxSpeed, int numberOfDoors) {
        super(brand, model, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void inspect() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Registration Number: " + getRegNumber());
    }

    @Override
    public void drive() {
        if (areAllDoorsClosed()) {
            startEngine();
            accelerate(50);
            System.out.println("Driving the car...");
        } else {
            System.out.println("Cannot drive. Not all doors are closed.");
        }
    }

    public boolean areAllDoorsClosed() {
        return allDoorsClosed;
    }

    public void openDoors() {
        allDoorsClosed = false;
        System.out.println("All doors are now open.");
    }

    public void closeDoors() {
        allDoorsClosed = true;
        System.out.println("All doors are now closed.");
    }
}