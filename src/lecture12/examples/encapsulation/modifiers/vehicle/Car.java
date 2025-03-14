package lecture12.examples.encapsulation.modifiers.vehicle;

// Subclass: Car, which extends Vehicle
public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor for Car class using super to call parent class constructor
    public Car(String brand, String model, int maxSpeed, int numberOfDoors) {
        super(brand, model, maxSpeed);  // Calling the constructor of the parent class (Vehicle)
        this.numberOfDoors = numberOfDoors;
    }

    // Method to inspect and use all accessible fields from Vehicle class
    public void inspectCar() {
        // This field is accessible because it is public
        System.out.println("Registration Number: " + regNumber);

        // This field is accessible because it is protected and Car is a subclass of Vehicle
        System.out.println("Max Speed: " + maxSpeed);

        // This field is accessible because it is package-private and Car is in the same package as Vehicle
        System.out.println("Current Speed: " + currentSpeed);

        // This field is not accessible because it is private
        // System.out.println("Brand: " + super.brand);

        // This field is not accessible because it is private
        // System.out.println("Model: " + super.model);

        // This field is accessible because is private and is in the scope of the class
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    // Method to drive the car and use all accessible methods from the parent class
    public void driveCar() {
        startEngine();  // This method is accessible because it is public
        accelerate(50); // This method is accessible because it is protected and Car is a subclass of Vehicle
        stopEngine();   // This method is accessible because it is package-private and Car is in the same package as Vehicle
    }


}