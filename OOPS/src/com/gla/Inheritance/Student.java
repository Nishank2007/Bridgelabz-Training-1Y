package com.gla.Inheritance;

public class Student extends Teacher {
    int RollNo;
    String name;
    String dep;

    public Student(int RollNo,String name,String dep,String n,String Subject,int id){
        super(n,Subject,id);
        this.RollNo=RollNo;
        this.name=name;
        this.dep=dep;
    }

    public void result(int score){

        if(score>=90){
            System.out.println("O Grade");
        }
        else if(score>=80 && score<90){
            System.out.println("A+ Grade");
        }
    }
}

