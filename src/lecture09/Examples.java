package lecture09;

public class Examples {
    public static void main(String[] args) {
//        demoConstructors();

        Penguin peshoPingvina = new Penguin("Pesho", 11, true);

        Penguin daniPingvina = new Penguin(false, 33);

        System.out.println(peshoPingvina.age);
        System.out.println(peshoPingvina.isEngaged);
        System.out.println(peshoPingvina.name);
    }


    public static void demoObjectCreation() {
        Cake vanillaCake = new Cake("", 2, 2);
        System.out.println(vanillaCake);

        Cake vanillaCake2 = new Cake();
        System.out.println(vanillaCake2);
    }

    public static void demoClassAttributes() {
        // Creating a Cake object
        Cake birthdayCake = new Cake();

        // Setting initial values
//        birthdayCake.flavor = "Chocolate";
        birthdayCake.setFlavor("Chocolate");
//        birthdayCake.layers = 3;
        birthdayCake.setLayers(3);
//        birthdayCake.price = 25.50;
        birthdayCake.setPrice(25.50);

        // Display initial values
        System.out.println("Initial Cake Details:");
        System.out.println("Flavor: " + birthdayCake.getFlavor()); // Outputs: Flavor: Chocolate
        System.out.println("Layers: " + birthdayCake.getLayers()); // Outputs: Layers: 3
        System.out.println("Price: $" + birthdayCake.getPrice()); // Outputs: Price: $25.50

        // Modifying values
        birthdayCake.setFlavor("Vanilla");
        birthdayCake.setLayers(4);
        birthdayCake.setPrice(30.75);

        // Display modified values
        System.out.println("Modified Cake Details:");
        System.out.println("Flavor: " + birthdayCake.getFlavor()); // Outputs: Flavor: Vanilla
        System.out.println("Layers: " + birthdayCake.getLayers()); // Outputs: Layers: 4
        System.out.println("Price: $" + birthdayCake.getPrice()); // Outputs: Price: $30.75
    }

    public static void demoClassMethods() {
        Cake birthdayCake = new Cake();

        // Setting initial values
        birthdayCake.setFlavor("Chocolate");
        birthdayCake.setLayers(3);
        birthdayCake.setPrice(25.50);
        // Print initial details
        birthdayCake.printDetails();

        // Calculate and print total price including tax
        double taxRate = 8.5; // 8.5% tax rate
        double totalPrice = birthdayCake.calculateTotalPrice(taxRate);
        System.out.println("Total Price with " + taxRate + "% tax: $" + totalPrice);
    }

    public static void demoConstructors() {
        // Create a Cake object using the no-argument constructor
        Cake defaultCake = new Cake();
        System.out.println("Default Cake Details:");
        defaultCake.printDetails();

        // Create a Cake object using the parameterized constructor
        Cake customCake = new Cake("Chocolate", 3, 30.0);
        System.out.println("\nCustom Cake Details:");
        customCake.printDetails();

//         Create a Cake object using the parameterized constructor
        Cake oreoCake = new Cake("Oreo", 2, 25.3);
        System.out.println("\nOreo Cake Details:");
        oreoCake.printDetails();

        Cake bananaCake = new Cake("Banana", 11);
        System.out.println("\nBanana Cake Details:");
        bananaCake.printDetails(); // Print the default double value
    }
}
