package lecture09.exercises;

public class Product {
    // Attributes of the Product class
    String name;
    double price;
    String category;
    int stockQuantity;
    boolean isOnSale;

    // Constructor to initialize the Product object
    public Product(String name, double price, String category, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.isOnSale = false; // Initially, the product is not on sale
    }

    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 1200.00, "Electronics", 15);
        Product product2 = new Product("Desk Chair", 150.00, "Furniture", 30);
        Product product3 = new Product("Notebook", 15.00, "Stationery", 100);

        // Putting the first two products on sale
        product1.putOnSale();
        product2.putOnSale();

        // Displaying product details
        product1.printProductDetails(); // Should show discounted price
        product2.printProductDetails(); // Should show discounted price
        product3.printProductDetails(); // Should show original price
    }

    // Method to put the product on sale
    public void putOnSale() {
        this.isOnSale = true;
    }

    // Method to calculate and return the discounted price if the product is on sale
    public double getDiscountedPrice() {
        if (isOnSale && price > 100) {
            return price * 0.90; // Apply a 10% discount
        }
        return price; // Return the original price if not on sale or price <= 100
    }

    // Method to print the product's name, category, and price
    public void printProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + getDiscountedPrice());
        System.out.println("On Sale: " + isOnSale);
        System.out.println();
    }
}
