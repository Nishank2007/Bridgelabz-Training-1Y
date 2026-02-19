package com.gla.String.Level1;
import java.util.*;

import static com.gla.String.Level1.CharacterArrayCompare.arr;
import static com.gla.String.Level1.CharacterArrayCompare.arrays;

import static com.gla.String.Level1.LowerCaseCompare.compareStrings;
import static com.gla.String.Level1.LowerCaseCompare.convertToLower;
import static com.gla.String.Level1.Substring.comp;
import static com.gla.String.Level1.Substring.createSubstring;
import static com.gla.String.Level1.UpperCaseCompare.convertToUpper;

public class Runner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //compare
        System.out.print("Enter 1st string: ");
        String a=sc.next();
        System.out.print("Enter 2nd string: ");
        String b=sc.next();
        Compare c1=new Compare();
        boolean result1=c1.comparison(a,b);
        boolean result2=a.equals(b);
        if(a==b){
            System.out.println("Both the method give the same result");
        }
        else{
            System.out.println("Both the method give the different result");
        }

        // substring
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        // Substring using charAt()
        String sub1 = createSubstring(str, start, end);
        //Substring using built in method
        String sub2 = str.substring(start, end);
        boolean result = comp(sub1, sub2);
        if(result){
            System.out.println("both substrings are equal");
        }
        else{
            System.out.println("both are different");
        }

        //array
        System.out.print("Enter a string: ");
        String string = sc.next();
        char[] user = arr(string);
        char[] built_in=string.toCharArray();
        boolean r =arrays(user,built_in);

        //Lower case
        System.out.println("Enter the text:");
        String alp = sc.nextLine();

        String manualLower = convertToLower(alp);
        String builtInLower = alp.toLowerCase();

        boolean result3 = compareStrings(manualLower, builtInLower);

        System.out.println("Lowercase (Manual): " + manualLower);
        System.out.println("Lowercase (Built-in): " + builtInLower);
        System.out.println("Are both same? " + result3);


        //Upper case
        System.out.println("Enter the text:");
        String text = sc.nextLine();

        String manualUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        boolean res = compareStrings(manualUpper, builtInUpper);

        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both same? " + res);


    }
}