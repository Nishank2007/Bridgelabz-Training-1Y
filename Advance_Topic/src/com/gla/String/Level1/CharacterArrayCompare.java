package com.gla.String.Level1;

public class CharacterArrayCompare {
        public static char[] arr(String string){
            char arr[]= new char[string.length()];
            for(int i=0;i<string.length();i++){
                arr[i]= string.charAt(i);
            }
            return arr;
        }
        public static boolean arrays(char num1[],char num2[]){
            if(num1.length!=num2.length){
                return false;
            }
            for(int i=0;i<num1.length;i++){
                if(num1[i]!=num2[i]){
                    return false;
                }
            }
            return true;
        }
}
