package com.gla.Inheritance;

public class Teacher {
    String n;
    int id;
    String Subject;
    public Teacher(String n,String Subject,int id){
        this.n=n;
        this.Subject=Subject;
        this.id=id;
    }
    public void printInfo() {
        System.out.println("Name of Teacher: " + n);
        System.out.println("Subject's name: " + Subject);
    }
}
