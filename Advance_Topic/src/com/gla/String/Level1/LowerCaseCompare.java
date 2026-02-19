package com.gla.String.Level1;

public class LowerCaseCompare {
    public static String convertToLower(String alp) {
        String result3 = "";
        for (int i = 0; i < alp.length(); i++) {
            char ch = alp.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // it converts into lowercase
                ch = (char) (ch + 32);
            }
            result3 = result3 + ch;
        }
            return result3;
    }
        // Method to compare two strings using charAt()
    public static boolean compareStrings(String c, String d) {
        if (c.length() != d.length()) {
                return false;
        }
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != d.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
