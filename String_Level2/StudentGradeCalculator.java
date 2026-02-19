package com.gla.String.Level2;
import java.util.Random;
public class StudentGradeCalculator {
    public class StudentGradeSystem {

        // a) Generate random PCM scores
        public static int[][] generateScores(int n) {

            Random r = new Random();
            int[][] scores = new int[n][3];  // Physics, Chemistry, Math

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    scores[i][j] = 10 + r.nextInt(91);  // 10–100
                }
            }

            return scores;
        }

        // b) Calculate total, average, percentage
        public static double[][] calculateResults(int[][] scores) {

            int n = scores.length;
            double[][] results = new double[n][3];
            // total, average, percentage

            for (int i = 0; i < n; i++) {

                int total = scores[i][0] + scores[i][1] + scores[i][2];
                double average = total / 3.0;
                double percentage = (total / 300.0) * 100;

                // Round to 2 decimal places
                average = Math.round(average * 100.0) / 100.0;
                percentage = Math.round(percentage * 100.0) / 100.0;

                results[i][0] = total;
                results[i][1] = average;
                results[i][2] = percentage;
            }

            return results;
        }
    }
}
