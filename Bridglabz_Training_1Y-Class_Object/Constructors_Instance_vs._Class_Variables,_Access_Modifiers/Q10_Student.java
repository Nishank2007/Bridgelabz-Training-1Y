class Q10_Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Q10_Student {
    void display() {
        System.out.println(rollNumber + " " + name);
    }
}