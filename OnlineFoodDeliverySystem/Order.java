package OnlineFoodDeliverySystem;
public class Order implements Runnable {

    private int orderId;
    private String restaurantName;
    private int deliveryTime; // in seconds
    private String deliveryType;

    public Order(int orderId, String restaurantName, int deliveryTime, String deliveryType) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.deliveryTime = deliveryTime;
        this.deliveryType = deliveryType;
    }

    @Override
    public void run() {
        try {
            String agent = Thread.currentThread().getName();
            long startTime = System.currentTimeMillis();

            System.out.println("\nAgent: " + agent +
                    " | Order ID: " + orderId +
                    " (" + deliveryType + ") from " + restaurantName +
                    " → Picked Up");

            Thread.sleep(1000); // small delay before transit

            System.out.println("Agent: " + agent + " | Order ID: " + orderId + " → In Transit");

            Thread.sleep(deliveryTime * 1000); // simulate delivery

            System.out.println("Agent: " + agent +
                    " | Order ID: " + orderId +
                    " → Delivered");

            long endTime = System.currentTimeMillis();
            System.out.println("Order ID: " + orderId +
                    " completed in " + (endTime - startTime)/1000 + " seconds\n");

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}