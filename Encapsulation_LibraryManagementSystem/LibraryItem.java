package out.gla.Encapsulation_LibraryManagementSystem;
public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;
    private String borrowerName; // sensitive data

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrowerName = null;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    protected void setBorrowerName(String name) {
        this.borrowerName = name;
    }

    protected String getBorrowerName() {
        return borrowerName;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }
}