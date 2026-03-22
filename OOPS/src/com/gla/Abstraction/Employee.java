package com.gla.Abstraction;

public abstract class Employee {

    String name;
    int id;
    double salary;

    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public abstract double calculateSalary(int hours,double rate);

    public void employeeinfo(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Salary:"+salary);
    }
}
