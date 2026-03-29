package out.gla.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import static out.gla.Exception.CustomException.ageChecker;
import static out.gla.Exception.InterestCalculator.calculateInterest;

public class Runner {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        /* Run Time */
        try{
            System.out.print("Enter 1st no.: ");
            int a=sc.nextInt();
            System.out.print("Enter 2nd no.: ");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by Zero.");
        }
        catch(InputMismatchException e){
            System.out.println("Error: Please enter valid numeric values.");
        }
        /* Invalid Age Checker Custom exception*/
        try{
            ageChecker(18);
        }
        catch(InvalidAgeChecker e){
            System.out.println(e);
        }
        /*Multiple Catch*/
        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] arr = null;

            if (size > 0) {
                arr = new int[size];

                System.out.println("Enter array elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            System.out.print("Enter index to retrieve: ");
            int index = sc.nextInt();

            MultipleCatch.getValue(arr, index);
        }

        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        /*Interest Calculator*/
        try {
            double amount = 10000;
            double rate = 5;
            int years = 2;

            double interest = (amount*rate*years)/1000;

            System.out.println("Calculated Interest: " + interest);
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        /*Division*/
        try {
            System.out.print("Enter first integer: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = sc.nextInt();

            int result = num1/num2;

            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Operation completed");
            sc.close();
        }
    }
}
