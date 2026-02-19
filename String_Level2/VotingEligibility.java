package com.gla.String.Level2;

import java.util.Random;

public class VotingEligibility {
    public static int[] generateRandomAges(int n) {

        Random r = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = 10 + r.nextInt(90);   // generates 10–99
        }

        return ages;
    }

    // b) Method to check voting eligibility
    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];
            boolean canVote = false;

            // Validate negative age
            if (age >= 0 && age >= 18) {
                canVote = true;
            }

            result[i][0] = String.valueOf(age);
            result[i][1] = String.valueOf(canVote);
        }

        return result;
    }

    // c) Method to display 2D array
    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("-------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
}
