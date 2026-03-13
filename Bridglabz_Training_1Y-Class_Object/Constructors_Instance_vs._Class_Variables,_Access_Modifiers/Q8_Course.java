class Q8_Course {
    String courseName;
    int duration;
    double fee;

    static String instituteName = "GLA University";

    Q8_Course(String n, int d, double f) {
        courseName = n;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Q8_Course c = new Q8_Course("Java", 6, 5000);
        c.displayCourseDetails();
    }
}