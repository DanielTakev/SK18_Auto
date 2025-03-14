package lecture12.examples.encapsulation.accessors;

public class Smartphone {
    private String brand;
    private String model;
    private double price;

    public double getPrice() {
        return price;
    }

    private String owner;

    // Constructor
    public Smartphone(String brand, String model, double price, String owner) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.owner = owner;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for a model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for price with additional logic
    public String getFormattedPrice() {
        return String.format("$%.2f", price);
    }

    // Getter for an owner with security check
    public String getOwner(String requester) {
        if (requester.equals("admin")) {
            return owner;
        } else {
            return "Access Denied";
        }
    }

    // Setter for price
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be positive");
        }
    }

    // Setter for an owner
    public void setOwner(String owner) {
        this.owner = owner;
    }
}