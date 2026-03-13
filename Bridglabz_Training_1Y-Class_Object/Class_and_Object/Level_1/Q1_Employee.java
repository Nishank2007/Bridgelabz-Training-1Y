class Employee {

    int id;
    String name;
    double salary;

    // Default Constructor
    Employee() {
        id = 0;
        name = "Unknown";
        salary = 0.0;
    }

    // Parameterized Constructor
    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();  
        Employee e2 = new Employee(101, "Rahul", 45000);

        System.out.println("Employee 1 Details:");
        e1.display();

        System.out.println("\nEmployee 2 Details:");
        e2.display();
    }
}