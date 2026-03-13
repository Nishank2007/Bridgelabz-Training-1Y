class Q4_HotelBooking {
    String guestName;
    String roomType;
    int nights;

    Q4_HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    Q4_HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    Q4_HotelBooking(Q4_HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    void display() {
        System.out.println(guestName + " " + roomType + " " + nights);
    }

    public static void main(String[] args) {
        Q4_HotelBooking h1 = new Q4_HotelBooking();
        Q4_HotelBooking h2 = new Q4_HotelBooking("Amit", "Deluxe", 3);
        Q4_HotelBooking h3 = new Q4_HotelBooking(h2);

        h1.display();
        h2.display();
        h3.display();
    }
}