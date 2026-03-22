package out.gla.Inheritance.MultilevelInheritance;
public class Runner {
    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder(
                101,
                "20-03-2026",
                "TRK123456",
                "22-03-2026"
        );

        order.displayDetails();
        System.out.println("Status: " + order.getOrderStatus());
    }
}