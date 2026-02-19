package com.gla.String.Level3;

public class UniqueCharacters {
    public static int findLength(String input) {
        int cnt = 0;
        for (char ch : input.toCharArray()) {
            cnt++;
        }
        return cnt;
    }
    public static char[] findUniqueCharacters(String input) {
        int size = findLength(input);
        char[] tempArr = new char[size];
        int pos = 0;
        for (int i = 0; i < size; i++) {
            char currentChar = input.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (currentChar == input.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                tempArr[pos++] = currentChar;
            }
        }
        char[] finalArr = new char[pos];
        for (int i = 0; i < pos; i++) {
            finalArr[i] = tempArr[i];
        }
        return finalArr;
    }
}
