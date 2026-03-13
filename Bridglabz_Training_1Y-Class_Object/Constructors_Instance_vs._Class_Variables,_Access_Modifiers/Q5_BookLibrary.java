class Q5_BookLibrary {
    String title;
    String author;
    double price;
    boolean available = true;

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }

    public static void main(String[] args) {
        Q5_BookLibrary b = new Q5_BookLibrary();
        b.borrowBook();
        b.borrowBook();
    }
}