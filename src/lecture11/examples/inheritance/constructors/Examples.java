package lecture11.examples.inheritance.constructors;

public class Examples {
    public static void main(String[] args) {
        demoInheritanceConstructors();
    }

    public static void demoInheritanceConstructors() {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Supra", 200, 4, "Gasoline");

        // Accessing the attributes and methods of the Car class
        myCar.playMusic();    // Method from Car
        myCar.openTrunk();    // Method from Car
        myCar.displayCarDetails(); // Method fom Car that calls method from Vehicle
        myCar.startEngine();   // Method from Vehicle (inherited)
        myCar.stopEngine();   // Method from Vehicle (inherited)

        // Creating an object of the Truck class
        Truck myTruck = new Truck("Ford", "F-150", 120, 1000);

        // Accessing the attributes and methods of the Truck class
        myTruck.loadCargo();  // Method from Truck
        myTruck.displayTruckDetails(); // Method from Truck that calls method from Vehicle
        myTruck.startEngine();   // Method from Vehicle (inherited)
        myTruck.stopEngine();   // Method from Vehicle (inherited)

        // Creating an object of the Vehicle class
        Vehicle myVehicle = new Vehicle("Honda", "Civic", 150);

        // Accessing the attributes and methods of the Vehicle class
        myVehicle.startEngine();  // Method from Vehicle
        myVehicle.stopEngine();   // Method from Vehicle
    }
}