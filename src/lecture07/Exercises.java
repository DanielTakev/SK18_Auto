package lecture07;

import java.util.HashMap;
import java.util.HashSet;

public class Exercises {
    public static void main(String[] args) {
    }

    public static void manageInventory() {
        // Create a HashMap to store the inventory
        HashMap<String, Integer> inventory = new HashMap<>();

        // Add products to the inventory with their quantities
        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Oranges", 20);
        inventory.put("Milk", 10);
        inventory.put("Bread", 15);

        // Print the entire inventory
        System.out.println("Initial Inventory: " + inventory);

        // Retrieve and print the quantity of a specific product
        System.out.println("\nChecking quantity of Bananas: " + inventory.get("Bananas") + " units");

        // Restock a product by increasing its quantity
        inventory.put("Oranges", inventory.get("Oranges") + 10);
        System.out.println("\nRestocked Oranges. New quantity: " + inventory.get("Oranges") + " units");

        // Mark a product as out of stock by setting its quantity to zero
        inventory.put("Milk", 0);
        System.out.println("\nMilk is now out of stock. Updated Inventory: " + inventory);

        // Remove a product from the inventory
        inventory.remove("Bread");
        System.out.println("\nRemoved Bread from inventory. Updated Inventory: " + inventory);

        // Print the final inventory
        System.out.println("\nFinal Inventory: " + inventory);
    }

    public static void manageGuestList() {
        // Create a HashSet to store the unique guest list
        HashSet<String> guestList = new HashSet<>();

        // Add guests to the list
        guestList.add("Alice");
        guestList.add("Bob");
        guestList.add("Charlie");
        guestList.add("Diana");
        guestList.add("Eve");

        // Print the entire guest list
        System.out.println("Initial Guest List: " + guestList);

        // Attempt to add a duplicate guest and observe that it isn't added
        boolean isAdded = guestList.add("Alice");
        System.out.println("\nTrying to add Alice again: " + (isAdded ? "Added" : "Already on the list"));

        // Remove a guest who can’t attend the party
        guestList.remove("Charlie");
        System.out.println("\nCharlie can't attend. Updated Guest List: " + guestList);

        // Check if a specific person is on the guest list
        boolean isOnList = guestList.contains("Diana");
        System.out.println("\nIs Diana on the guest list? " + (isOnList ? "Yes" : "No"));

        // Print the final guest list
        System.out.println("\nFinal Guest List: " + guestList);
    }
}