package out.gla.DefaultInterface;
public interface Payment {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed using default method.");
    }
}

