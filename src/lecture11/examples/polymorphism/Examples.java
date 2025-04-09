package lecture11.examples.polymorphism;

public class Examples {
    public static void main(String[] args) {
        demoPolymorphism();
    }

    public static void demoPolymorphism() {
        // Creating objects of Car and Truck

        Car myCar = new Car("Toyota", "Supra", 200, 4, "Gasoline");
        Truck myTruck = new Truck("Ford", "F-150", 160, 2000);

        // Using polymorphism with Vehicle reference
        Vehicle myVehicle1Car = myCar;  // Car object assigned to Vehicle reference
        Vehicle myVehicle2Truck = myTruck; // Truck object assigned to Vehicle reference
        Vehicle myParentVehicle = new Vehicle("VehicleParent", "V", 11);

        myCar.performMaintenance();
        System.out.println("______________");

        // Call performMaintenance() on Car object through Vehicle reference
        myVehicle1Car.performMaintenance(); // This will call Car's performMaintenance() method
        System.out.println("______________");

        // Call performMaintenance() on Truck object through Vehicle reference
        myVehicle2Truck.performMaintenance(); // This will call Truck's performMaintenance() method
        System.out.println("______________");

        // Display details for each vehicle
        myCar.displayDetails();  // Display details for Car
        System.out.println("______________");
        myTruck.displayDetails();  // Display details for Truck
        System.out.println("______________");
        myParentVehicle.displayDetails();
    }
}
