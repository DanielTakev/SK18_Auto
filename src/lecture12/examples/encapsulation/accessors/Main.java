package lecture12.examples.encapsulation.accessors;

public class Main {
    public static void main(String[] args) {
        // Create a new Smartphone object
        Smartphone smartphone = new Smartphone("Apple", "iPhone 13", 999.99, "John Doe");

        // Demonstrate getters
        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Model: " + smartphone.getModel());
        System.out.println("Price: " + smartphone.getFormattedPrice());
        System.out.println("Owner (admin): " + smartphone.getOwner("admin"));
        System.out.println("Owner (user): " + smartphone.getOwner("user"));

        // Demonstrate setters
        smartphone.setBrand("Samsung");
        smartphone.setModel("Galaxy S21");
        smartphone.setPrice(799.99);
        smartphone.setOwner("Jane Doe");

        // Demonstrate getters after using setters
        System.out.println("Updated Brand: " + smartphone.getBrand());
        System.out.println("Updated Model: " + smartphone.getModel());
        System.out.println("Updated Price: " + smartphone.getFormattedPrice());
        System.out.println("Updated Owner (admin): " + smartphone.getOwner("admin"));
        System.out.println("Updated Owner (user): " + smartphone.getOwner("user"));
    }
}
