package lecture12.examples.abstraction.abstractionclass;

public class Main {
    /**
     * The Main class demonstrates the use of abstraction by creating instances of Truck and Car through the Vehicle reference.
     * It shows how the common interface provided by Vehicle can be used to interact with different types
     * of vehicles without needing to know their specific details.
     */
    public static void main(String[] args) {
//        Vehicle myV = new Vehicle();
        Vehicle truck = new Truck("Volvo", "FH16", 120, 30000);
        Vehicle car = new Car("Toyota", "Camry", 180, 4);

        System.out.println("Inspecting Truck:");
        truck.inspect();
        System.out.println();

        System.out.println("Inspecting Car:");
        car.inspect();
        System.out.println();

        System.out.println("Attempting to drive the truck without cargo:");
        truck.drive();
        System.out.println();

        System.out.println("Loading cargo into the truck:");
        ((Truck) truck).loadCargo(15000);
        System.out.println();

        System.out.println("Attempting to drive the truck with cargo:");
        truck.drive();
        System.out.println();

        System.out.println("Attempting to drive the car with doors open:");
        ((Car) car).openDoors();
        car.drive();
        System.out.println();

        System.out.println("Closing car doors and attempting to drive:");
        ((Car) car).closeDoors();
        car.drive();
    }
}