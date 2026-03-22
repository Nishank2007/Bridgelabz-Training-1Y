package out.gla.Encapsulation_LibraryManagementSystem;
public class Magazine extends LibraryItem implements Reservable {

    private boolean isAvailable = true;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // magazines have shorter loan period
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            setBorrowerName(borrowerName);
            isAvailable = false;
            System.out.println("Magazine reserved.");
        } else {
            System.out.println("Magazine not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
