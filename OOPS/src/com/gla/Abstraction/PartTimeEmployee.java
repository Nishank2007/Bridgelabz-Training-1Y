package com.gla.Abstraction;

public class PartTimeEmployee extends Employee{
    String dep;

    public PartTimeEmployee(String name,int id,double salary,String dep){
        super(name,id,salary);
        this.dep=dep;
    }

    @Override
    public double calculateSalary(int hours, double rate) {
        return hours*rate;
    }
    public void InfoPEmployee(){
        System.out.println(dep);
    }
}
