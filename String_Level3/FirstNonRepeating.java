package com.gla.String.Level3;

public class FirstNonRepeating {
    public static char findFirstNonRepeating(String inputText) {
        int[] freqArr = new int[256];   // ASCII characters
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            freqArr[ch]++;
        }
        // Step 2: find first character with frequency 1
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            if (freqArr[ch] == 1) {
                return ch;
            }
        }
        return '\0';   // if no non-repeating character
    }
}
