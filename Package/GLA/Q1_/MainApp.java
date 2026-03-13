package com.GLA.Q1_;

import com.GLA.Q1_.Student;
import com.GLA.Q1_.Faculty;

public class MainApp {
    public static void main(String[] args) {

        Student s = new Student("Rahul",101);
        Faculty f = new Faculty("Dr. Sharma","Java");

        s.displayStudent();
        f.displayFaculty();
    }
}