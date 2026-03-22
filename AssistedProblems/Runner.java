package out.gla.Inheritance.AssistedProblems;
import out.gla.Inheritance.AssistedProblems.AnimalHierarchy.Animal;
import out.gla.Inheritance.AssistedProblems.AnimalHierarchy.Bird;
import out.gla.Inheritance.AssistedProblems.AnimalHierarchy.Cat;
import out.gla.Inheritance.AssistedProblems.AnimalHierarchy.Dog;
import out.gla.Inheritance.AssistedProblems.EmployeeManagementSystem.Developer;
import out.gla.Inheritance.AssistedProblems.EmployeeManagementSystem.Employee;
import out.gla.Inheritance.AssistedProblems.EmployeeManagementSystem.Intern;
import out.gla.Inheritance.AssistedProblems.EmployeeManagementSystem.Manager;

public class Runner {
    public static void main(String[] args) {
        /// ////Animal Hierarchy
        Animal a1 = new Dog("Tommy", 4);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Tweety", 1);

        Animal[] animals = {a1, a2, a3};

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
        ////////Employee management system
        Employee e1 = new Manager("Amit", 101, 80000, 5);
        Employee e2 = new Developer("Riya", 102, 60000, "Java");
        Employee e3 = new Intern("Karan", 103, 20000, 6);

        Employee[] employees = {e1, e2, e3};

        for (int i = 0; i < employees.length; i++) {
            employees[i].displayDetails();
        }
    }
}