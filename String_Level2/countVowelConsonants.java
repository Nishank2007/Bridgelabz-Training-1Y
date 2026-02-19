package com.gla.String.Level2;
import java.util.*;

public class countVowelConsonants {
    public countVowelConsonants(String a) {

    }

    static int[] countVowelConsonants(String a)
    {
        int vowels=0;
        int consonants=0;
        for(int i=0;i<a.length();i++)
        {
            char ch= a.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
            {
                vowels++;
            }
            else if((ch>'a' && ch<'z')||(ch>'A' && ch<'Z'))
            {
                consonants++;
            }
            else
            {
                System.out.println("invalid");
            }
        }
        return new int[]{vowels,consonants};
    }
}