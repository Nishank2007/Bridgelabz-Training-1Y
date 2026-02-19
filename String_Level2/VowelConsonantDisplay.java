package com.gla.String.Level2;

public class VowelConsonantDisplay {
    public static String checkCharacterType(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        // Check if letter
        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                return "Vowel";
            }
            else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to create 2D array of character and its type
    public static String[][] analyzeString(String text) {

        int len = text.length();
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {

            char ch = text.charAt(i);

            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
}
