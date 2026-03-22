package out.gla.Encapsulation_LibraryManagementSystem;
import java.util.List;

public class LibraryService {

    public static void processLibraryItems(List<LibraryItem> items) {

        for(int i = 0; i < items.size(); i++) {

            LibraryItem item = items.get(i);

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
            }

            System.out.println("-----------------------------");
        }
    }
}
