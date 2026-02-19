package com.gla.String.Level3;

public class PalindromicLogic {
    public static boolean isPalindromeLoop(String textVal) {

        int startIdx = 0;
        int endIdx = textVal.length() - 1;

        while (startIdx < endIdx) {
            if (textVal.charAt(startIdx) != textVal.charAt(endIdx)) {
                return false;
            }
            startIdx++;
            endIdx--;
        }
        return true;
    }

    // LOGIC 2: Using recursion
    public static boolean isPalindromeRecursive(String textVal, int startIdx, int endIdx) {

        if (startIdx >= endIdx) {
            return true;
        }

        if (textVal.charAt(startIdx) != textVal.charAt(endIdx)) {
            return false;
        }

        return isPalindromeRecursive(textVal, startIdx + 1, endIdx - 1);
    }

    // LOGIC 3 (i): Reverse string using charAt()
    public static char[] reverseText(String textVal) {

        char[] revArr = new char[textVal.length()];
        int pos = 0;

        for (int i = textVal.length() - 1; i >= 0; i--) {
            revArr[pos++] = textVal.charAt(i);
        }
        return revArr;
    }

    // LOGIC 3 (ii): Palindrome check using character arrays
    public static boolean isPalindromeArray(String textVal) {

        char[] originalArr = textVal.toCharArray();
        char[] reverseArr = reverseText(textVal);

        for (int i = 0; i < originalArr.length; i++) {
            if (originalArr[i] != reverseArr[i]) {
                return false;
            }
        }
        return true;
    }
}
