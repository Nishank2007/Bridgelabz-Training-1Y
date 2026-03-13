class Q6_CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    Q6_CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    void calculateCost() {
        int cost = rentalDays * 1000;
        System.out.println("Total Cost: " + cost);
    }

    public static void main(String[] args) {
        Q6_CarRental c = new Q6_CarRental("Raj", "Swift", 3);
        c.calculateCost();
    }
}