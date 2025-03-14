package lecture12.examples.abstraction.interfaces;

public interface Payment {

    void processPayment(double amount);

    void refundPayment(double amount);
}