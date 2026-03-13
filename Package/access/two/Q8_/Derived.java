package com.access.two.Q8_;

public class Derived extends Base {

    public static void main(String[] args) {

        Derived d = new Derived();

        d.publicMethod();
        d.protectedMethod();

        // defaultMethod() not accessible
        // privateMethod() not accessible
    }
}