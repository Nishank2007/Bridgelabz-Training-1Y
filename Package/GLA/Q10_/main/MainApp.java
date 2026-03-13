package com.GLA.Q10_.main;



import com.GLA.Q10_.student.*;
import com.GLA.Q10_.faculty.*;
import com.GLA.Q10_.department.*;

public class MainApp {

    public static void main(String[] args) {

        Student s = new Student("Rahul");
        Faculty f = new Faculty("Dr Sharma");
        Department d = new Department("Computer Science");

        s.display();
        f.display();
        d.display();
    }
}