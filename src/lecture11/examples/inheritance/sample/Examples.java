package lecture11.examples.inheritance.sample;

public class Examples {
    public static void main(String[] args) {
        demoInheritance();
    }

    public static void demoInheritance() {
        // Creating an object of the Car class
        Car myCar = new Car();

        // Accessing the attributes and methods of the Car class
        myCar.brand = "Toyota";
        myCar.maxSpeed = 200;
        myCar.numberOfDoors = 4;
        myCar.fuelType = "Gasoline";

        // Accessing methods from both the parent Vehicle class and the Car class
        myCar.startEngine();  // Inherited method from Vehicle
        myCar.playMusic();    // Method from Car
        myCar.openTrunk();    // Method from Car
        myCar.stopEngine();   // Inherited method from Vehicle

        // Now, creating an object of the Vehicle class
        Vehicle myVehicle = new Vehicle();

        // Accessing the attributes and methods of the Vehicle class
        myVehicle.brand = "Honda";
        myVehicle.maxSpeed = 150;

        myVehicle.startEngine();  // Method from Vehicle
        myVehicle.stopEngine();   // Method from Vehicle

        // The following lines would cause a compile-time error if uncommented,
        // because a Vehicle object cannot access attributes or methods defined in Car.

        // myVehicle.fuelType = "Diesel";    // Error: Cannot find symbol
        // myVehicle.playMusic();            // Error: Cannot find symbol
        // myVehicle.openTrunk();            // Error: Cannot find symbol
    }
}