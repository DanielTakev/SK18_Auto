package lecture12.examples.abstraction.interfaces;

public class CreditCardPayment implements Payment, PaymentNew {
    @Override
    public void processPayment(double amount) {
        // Implementation for processing credit card payment
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void refundPayment(double amount) {
        // Implementation for refunding credit card payment
        System.out.println("Refunding credit card payment of $" + amount);
    }

    @Override
    public void addPayment(String amount) {
        System.out.println("addPayment");
    }

    @Override
    public void deletePaymentMethod() {
        System.out.println("deletePaymentMethod");
    }
}