package lecture11.examples.inheritance.sample;

// Parent class
public class Vehicle {

    // Attributes
    private String brand;
    public int maxSpeed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Method
    public void startEngine() {
        System.out.println(brand + " The engine of the vehicle has started.");
    }

    public void stopEngine() {
        System.out.println("The engine of the vehicle has stopped.");
    }
}