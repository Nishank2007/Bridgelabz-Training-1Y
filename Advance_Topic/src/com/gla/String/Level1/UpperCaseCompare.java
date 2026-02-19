package com.gla.String.Level1;

public class UpperCaseCompare {
    // Method to convert text to uppercase using ASCII logic
    public static String convertToUpper(String alpha) {
        String res = "";
        for (int i = 0; i < alpha.length(); i++) {
            char ch = alpha.charAt(i);
            // If character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);   // Convert to uppercase
            }
            res = res + ch;
        }
        return res;
    }
    public static boolean compareStrings(String s_1, String s_2) {
        if (s_1.length() != s_2.length()) {
            return false;
        }
        for (int i = 0; i < s_1.length(); i++) {
            if (s_1.charAt(i) != s_2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
