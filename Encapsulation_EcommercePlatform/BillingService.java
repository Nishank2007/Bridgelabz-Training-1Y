package out.gla.Encapsulation_EcommercePlatform;
import java.util.List;

public class BillingService {

    public static void printFinalBill(List<Product> products) {

        for (int i = 0; i < products.size(); i++) {

            Product p = products.get(i);

            double price = p.getPrice();
            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double finalPrice = price + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Base Price: " + price);
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("---------------------------");
        }
    }
}
