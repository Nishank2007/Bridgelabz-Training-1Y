class Q7_Product {
    String productName;
    double price;

    static int totalProducts = 0;

    Q7_Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println(productName + " " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Q7_Product p1 = new Q7_Product("Pen", 10);
        Q7_Product p2 = new Q7_Product("Book", 50);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Q7_Product.displayTotalProducts();
    }
}