package com.gla.String.Level3;

public class CharacterFrequency {
    public static char[][] findFrequency(String inputStr) {

        int[] freq = new int[256];   // ASCII frequency array

        // Step 1 & 2: count frequency using charAt()
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            freq[ch]++;
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            if (freq[inputStr.charAt(i)] != 0) {
                count++;
                freq[inputStr.charAt(i)] = 0; // avoid duplicate count
            }
        }

        // Reset frequency array
        for (int i = 0; i < inputStr.length(); i++) {
            freq[inputStr.charAt(i)]++;
        }

        // Step 3: create 2D array
        char[][] resultArr = new char[count][2];
        int index = 0;

        // Step 4: store character and frequency
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);

            if (freq[ch] != 0) {
                resultArr[index][0] = ch;
                resultArr[index][1] = (char) freq[ch]; // store frequency
                index++;
                freq[ch] = 0; // avoid repetition
            }
        }

        return resultArr;
    }
}
