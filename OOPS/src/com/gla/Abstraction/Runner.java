package com.gla.Abstraction;

public class Runner {
    public static void main(String[] args) {
        PartTimeEmployee p1 = new PartTimeEmployee("nishank", 101, 0, "CS");
        p1.employeeinfo();
        double paid = p1.calculateSalary(3, 1000);
        System.out.println(paid);
        p1.InfoPEmployee();
    }
}
