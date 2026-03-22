package out.gla.Encapsulation_LibraryManagementSystem;
public class DVD extends LibraryItem implements Reservable {

    private boolean isAvailable = true;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // DVDs shorter duration
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            setBorrowerName(borrowerName);
            isAvailable = false;
            System.out.println("DVD reserved.");
        } else {
            System.out.println("DVD not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}