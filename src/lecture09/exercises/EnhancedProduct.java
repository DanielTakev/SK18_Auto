package lecture09.exercises;

import java.util.ArrayList;
import java.util.List;

public class EnhancedProduct {
    // Static attribute to track the current sale category
    private static String categoryOnSale = null;
    // Static list to keep track of all products
    private static List<EnhancedProduct> allProducts = new ArrayList<>();

    // Instance attributes
    private String name;
    private double price;
    private String category;
    private boolean isOnSale;

    // Constructor
    public EnhancedProduct(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        // Add the new EnhancedProduct to the list of all products
        allProducts.add(this);
        updateSaleStatus();
    }

    // Static method to set the category currently on sale
    public static void setCategoryOnSale(String category) {
        categoryOnSale = category;
        // Update sale status for all products based on the new sale category
        updateAllProductsSaleStatus();
    }

    // Static method to update sale status for all products based on the current sale category
    private static void updateAllProductsSaleStatus() {
        for (EnhancedProduct product: allProducts) {
            product.updateSaleStatus();
        }
    }

    // Method to change the product's category and update its sale status
    void setCategory(String newCategory) {
        this.category = newCategory;
        updateSaleStatus();
    }

    // Private method to update the sale status of this EnhancedProductbased on the current sale category
    private void updateSaleStatus() {
        this.isOnSale = category.equals(categoryOnSale);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create some products
        EnhancedProduct p1 = new EnhancedProduct("Laptop", 1200, "Electronics");
        EnhancedProduct p2 = new EnhancedProduct("Phone", 800, "Electronics");
        EnhancedProduct p3 = new EnhancedProduct("Shirt", 30, "Clothing");

        // Set Electronics as the sale category
        EnhancedProduct.setCategoryOnSale("Electronics");

        // Print details of all products
        p1.printProductDetails();
        p2.printProductDetails();
        p3.printProductDetails();

        // Change the category of p1 and update the sale status
        p1.setCategory("Clothing");

        // Print details of all products again
        p1.printProductDetails();
        p2.printProductDetails();
        p3.printProductDetails();

        // Change sale category to Clothing
        EnhancedProduct.setCategoryOnSale("Clothing");

        // Print details of all products once more
        p1.printProductDetails();
        p2.printProductDetails();
        p3.printProductDetails();
    }

    // Method to calculate and return the discounted price if the EnhancedProductis on sale
    public double getDiscountedPrice() {
        if (isOnSale && price > 100) {
            return price * 0.90; // Apply a 10% discount
        }
        return price; // Return the original price if not on sale or price <= 100
    }

    // Method to print the product’s name, category, and price (discounted or original)
    public void printProductDetails() {
        System.out.println("EnhancedProductName: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + getDiscountedPrice());
        System.out.println("Is on sale: " + isOnSale);
    }
}
