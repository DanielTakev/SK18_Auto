package lecture12.examples.abstraction.interfaces;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        // Implementation for processing PayPal payment
        System.out.println("Processing PayPal payment of $" + amount);
    }

    @Override
    public void refundPayment(double amount) {
        // Implementation for refunding PayPal payment
        System.out.println("Refunding PayPal payment of $" + amount);
    }
}