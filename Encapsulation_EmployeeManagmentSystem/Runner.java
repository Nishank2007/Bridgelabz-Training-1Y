package out.gla.Encapsulation_EmployeeManagmentSystem;
import java.util.ArrayList;
import java.util.List;
public class Runner {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new FullTimeEmployee(101, "Rahul", 50000);
        emp1.assignDepartment("IT");

        Employee emp2 = new PartTimeEmployee(102, "Priya", 0, 80, 200);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            emp.displayDetails();
        }
    }
}