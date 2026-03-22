package out.gla.Encapsulation_EcommercePlatform;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "T-Shirt", 1500));
        products.add(new Groceries(3, "Rice", 800));
        BillingService.printFinalBill(products);
    }
}
