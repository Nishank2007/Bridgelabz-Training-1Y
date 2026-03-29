package com.gla.Exception;

public class HandlingPractice {
    static void ageChecker (int age) throws ArithmeticException,NullPointerException
    {
        if(age<18) {
            throw new ArithmeticException("Invalid Age!");
        }
    }
    public static void main(String args[]){
        try{
            ageChecker(10);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
