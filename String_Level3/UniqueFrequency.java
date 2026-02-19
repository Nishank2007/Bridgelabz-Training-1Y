package com.gla.String.Level3;

public class UniqueFrequency {
    public static char[] findUniqueChars(String textVal) {

        char[] tempArr = new char[textVal.length()];
        int pos = 0;

        for (int i = 0; i < textVal.length(); i++) {
            char curr = textVal.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (curr == textVal.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempArr[pos++] = curr;
            }
        }

        // exact size array
        char[] uniqueArr = new char[pos];
        for (int i = 0; i < pos; i++) {
            uniqueArr[i] = tempArr[i];
        }

        return uniqueArr;
    }

    // Method to find frequency using unique characters
    public static String[][] findFrequency(String textVal) {

        int[] freqArr = new int[256];   // ASCII array

        // Step i & ii: count frequency
        for (int i = 0; i < textVal.length(); i++) {
            char ch = textVal.charAt(i);
            freqArr[ch]++;
        }

        // Step iii: get unique characters
        char[] uniqueChars = findUniqueChars(textVal);

        // Step iv: create 2D String array
        String[][] resultArr = new String[uniqueChars.length][2];

        // Step v: store character & frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            resultArr[i][0] = String.valueOf(ch);
            resultArr[i][1] = String.valueOf(freqArr[ch]);
        }
        return resultArr;
    }
}
