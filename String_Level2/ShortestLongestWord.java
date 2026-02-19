package com.gla.String.Level2;

public class ShortestLongestWord {
    public static int findLength(String text){
        int count = 0;
        char[] arr = text.toCharArray();
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
            result[i][1] = String.valueOf(len);   // int → String
        }
        return result;
    }
    public static int[] findShortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
}
