class Q2_Circle {
    double radius;

    Q2_Circle() {
        this(1);
    }

    Q2_Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Q2_Circle c1 = new Q2_Circle();
        Q2_Circle c2 = new Q2_Circle(5);

        c1.display();
        c2.display();
    }
}