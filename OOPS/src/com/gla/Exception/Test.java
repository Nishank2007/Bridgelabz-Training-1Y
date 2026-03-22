package com.gla.Exception;
import java.lang.Exception;
public class Test {
    public static void arithmeticException(){
        try {
            int a = 10;
            int b=0;
            double result=a/b;
            System.out.println(result);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void NullPointerException(){
        try{
            String s1=null;
            String s2=null;
            s1.equals(s2);

        } catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
    public static void IndexOutOfBound(){
        try{
            int arr[]={1,2,3,4,5};

            System.out.println(arr[3]);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }



}
