package OnlineFoodDeliverySystem;

public class Runner {
    public static void main(String[] args) {

        Order o1 = new Order(101, "Dominos", 4, "Express");
        Order o2 = new Order(102, "KFC", 6, "Standard");
        Order o3 = new Order(103, "McDonalds", 5, "Economy");
        Order o4 = new Order(104, "Pizza Hut", 3, "Express");
        Order o5 = new Order(105, "Burger King", 7, "Standard");

        Thread t1 = new Thread(o1, "Agent-1");
        Thread t2 = new Thread(o2, "Agent-2");
        Thread t3 = new Thread(o3, "Agent-3");
        Thread t4 = new Thread(o4, "Agent-4");
        Thread t5 = new Thread(o5, "Agent-5");

        t1.setPriority(10); // Express
        t2.setPriority(5);  // Standard
        t3.setPriority(3);  // Economy
        t4.setPriority(10); // Express
        t5.setPriority(5);  // Standard

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All orders delivered successfully!");
    }
}