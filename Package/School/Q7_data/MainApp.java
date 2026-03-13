package com.School.Q7_data;

public class MainApp {

    public static void main(String[] args) {

        Student s = new Student("Aman",80,75,90);

        Analyzer a = new Analyzer();

        double avg = a.calculateAverage(s);

        System.out.println(s);
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+a.findGrade(avg));
    }
}