package out.gla.Encapsulation_LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class Runner {
    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Java Programming", "James Gosling"));
        items.add(new Magazine(2, "Tech Monthly", "Editorial Team"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        LibraryService.processLibraryItems(items);

        Book b = (Book) items.get(0);
        b.reserveItem("Rahul");
    }
}
