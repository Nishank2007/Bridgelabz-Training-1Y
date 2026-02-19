package com.gla.String.Level2;

public class WordLength2D {
    public static int findLength(String text) {
        int count = 0;
        char[] arr = text.toCharArray();   // allowed (not using length())
        for (char c : arr) {
            count++;
        }
        return count;
    }
    public static String[] manualSplit(String text) {
        int len = text.length();
        int wordCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ' &&
                    (i == 0 || text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int index = 0;
        String word = "";
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                word = word + text.charAt(i);
            }
            else {
                if (!word.equals("")) {
                    words[index++] = word;
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            words[index] = word;
        }
        return words;
    }
    public static String[][] getWordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);  // convert int to String
        }
        return result;
    }
}
