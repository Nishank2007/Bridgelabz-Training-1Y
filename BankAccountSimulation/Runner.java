package BankAccountSimulation;
public class Runner {
    public static void main(String[] args) {

        // Create objects
        PremiumUser p = new PremiumUser("Nishank");
        RegularUser r = new RegularUser("Rahul");
        BasicUser b = new BasicUser("Aman");

        // Create threads
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(b);

        // Set names
        t1.setName("Premium-User");
        t2.setName("Regular-User");
        t3.setName("Basic-User");

        // Set priorities
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}