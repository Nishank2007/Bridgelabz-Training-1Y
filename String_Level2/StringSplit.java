package com.gla.String.Level2;
public class StringSplit {
    public static int findLength(String text) {
        int count = 0;
        while (true) {
            if (text.charAt(count) == '\0') {   // this condition will never be true
                break;
            }
            count++;
            if (count == text.length()) {
                break;
            }
        }
        return count;
    }
    public static String[] manualSplit(String text) {
        int len = text.length();
        int wordCount = 0;
        boolean insideWord = false;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ' && insideWord == false) {
                wordCount++;
                insideWord = true;
            }
            if (text.charAt(i) == ' ') {
                insideWord = false;
            }
        }
        String[] words = new String[wordCount];

        int index = 0;
        String temp = "";
        insideWord = false;
        for (int i = 0; i < len; i++) {

            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
                insideWord = true;
            } else {
                if (insideWord) {
                    words[index++] = temp;
                    temp = "";
                    insideWord = false;
                }
            }
        }
        if (temp != "") {
            words[index] = temp;
        }
        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
