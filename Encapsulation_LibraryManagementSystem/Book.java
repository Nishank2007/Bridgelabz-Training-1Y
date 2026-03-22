package out.gla.Encapsulation_LibraryManagementSystem;
public class Book extends LibraryItem implements Reservable {

    private boolean isAvailable = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            setBorrowerName(borrowerName);
            isAvailable = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
