package out.gla.DefaultInterface;

public class UPI implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("UPI refund initiated for: " + amount);
    }
}
