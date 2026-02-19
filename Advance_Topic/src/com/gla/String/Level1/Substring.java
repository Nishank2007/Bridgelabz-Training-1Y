package com.gla.String.Level1;

public class Substring {
    public static String createSubstring(String str, int start, int end){
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }
    public static boolean comp(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

