package com.School.Q7_data;

public class Analyzer {

    public double calculateAverage(Student s){
        return s.getTotal()/3.0;
    }

    public String findGrade(double avg){

        if(avg>=80) return "A";
        else if(avg>=60) return "B";
        else return "C";
    }
}