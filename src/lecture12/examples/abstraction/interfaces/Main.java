package lecture12.examples.abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();

        double amount = 100.0;

        // Process payments
        creditCardPayment.processPayment(amount);
        payPalPayment.processPayment(amount);

        // Refund payments
        creditCardPayment.refundPayment(amount);
        payPalPayment.refundPayment(amount);
    }
}