class Q1_Book {
    String title;
    String author;
    double price;

    Q1_Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Q1_Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Q1_Book b1 = new Q1_Book();
        Q1_Book b2 = new Q1_Book("Java", "James", 500);

        b1.display();
        b2.display();
    }
}