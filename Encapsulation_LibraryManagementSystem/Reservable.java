package out.gla.Encapsulation_LibraryManagementSystem;
public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}