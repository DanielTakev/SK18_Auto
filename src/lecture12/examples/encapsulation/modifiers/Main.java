package lecture12.examples.encapsulation.modifiers;

import lecture12.examples.encapsulation.modifiers.vehicle.Car;
import lecture12.examples.encapsulation.modifiers.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Create a new Vehicle object
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 180);

        // Demonstrate Vehicle methods
        vehicle.startEngine();
        // vehicle.accelerate(60); // This method is protected and not accessible here
        // vehicle.stopEngine(); // This method is not public and not accessible here

        // Create a new Car object
        Car car = new Car("Honda", "Civic", 200, 5);

        // Demonstrate Car methods
        car.inspectCar();
        car.driveCar();

        // Create a new Truck object
        Truck truck = new Truck("Volvo", "FH16", 120, 30000);

        // Demonstrate inspectTruck method
        truck.inspectTruck();

        // Demonstrate driveTruck method
        truck.driveTruck();
    }
}