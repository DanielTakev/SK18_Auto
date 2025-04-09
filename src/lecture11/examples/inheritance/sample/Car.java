package lecture11.examples.inheritance.sample;

// Child class
public class Car extends Vehicle {
    // Additional attributes specific to Car
    public int numberOfDoors;
    public String fuelType;

    // Additional method specific to Car
    public void playMusic() {
        System.out.println("Playing music in the car.");
    }

    public void openTrunk() {
        System.out.println("The trunk of the car is now open.");
    }
}

