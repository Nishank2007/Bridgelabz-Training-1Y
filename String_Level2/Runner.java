package com.gla.String.Level2;
import java.util.*;
import java.util.Arrays;

import static com.gla.String.Level2.ManualTrim.*;
import static com.gla.String.Level2.RockPaperScissor.*;
import static com.gla.String.Level2.ShortestLongestWord.findShortestLongest;
import static com.gla.String.Level2.StringSplit.compareArrays;
import static com.gla.String.Level2.StringSplit.manualSplit;
import static com.gla.String.Level2.StudentGradeCalculator.StudentGradeSystem.calculateResults;
import static com.gla.String.Level2.StudentGradeCalculator.StudentGradeSystem.generateScores;
import static com.gla.String.Level2.VotingEligibility.checkVoting;
import static com.gla.String.Level2.VowelConsonantDisplay.analyzeString;
import static com.gla.String.Level2.VowelConsonantDisplay.displayResult;
import static com.gla.String.Level2.WordLength2D.getWordWithLength;
import static com.gla.String.Level2.countVowelConsonants.countVowelConsonants;
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringSplit
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String[] manualResult = manualSplit(text);
        String[] builtInResult = text.split(" ");

        System.out.println("\nManual Split Result:");
        for (int i = 0; i < manualResult.length; i++) {
            System.out.println(manualResult[i]);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (int i = 0; i < builtInResult.length; i++) {
            System.out.println(builtInResult[i]);
        }
        boolean result = compareArrays(manualResult, builtInResult);
        System.out.println("\nAre both results same? " + result);
        //WordLegth2d
        System.out.println("Enter text:");
        String text1 = sc.nextLine();

        String[] words = manualSplit(text1);

        String[][] result1 = getWordWithLength(words);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < result1.length; i++) {

            String word = result1[i][0];
            int length = Integer.parseInt(result1[i][1]);

            System.out.println(word + "\t" + length);
        }


        //ShortestLongest
        System.out.println("Enter text:");
        String s = sc.nextLine();
        String[] word = manualSplit(text);
        String[][] wordData = getWordWithLength(word);
        int[] result2 = findShortestLongest(wordData);
        System.out.println("\nWords with Length:");
        for (int i = 0; i < wordData.length; i++) {
            System.out.println(wordData[i][0] + " - " + wordData[i][1]);
        }
        System.out.println("\nShortest Word: " + wordData[result2[0]][0]);
        System.out.println("Longest Word: " + wordData[result2[1]][0]);


        // countVowelConsonant
        int arr[] = countVowelConsonants("Nishank");
        System.out.println(Arrays.toString(arr));

        //6
        System.out.println("Enter a string:");
        String text4 = sc.nextLine();

        String[][] result4 = analyzeString(text);

        displayResult(result4);

        //7
        System.out.println("Enter text with spaces:");
        String text5 = sc.nextLine();

        // Step 1: Find trim indexes
        int[] indexes = findTrimIndexes(text5);

        String manualTrimmed = "";

        // Step 2: Create substring manually if valid
        if (indexes[0] <= indexes[1]) {
            manualTrimmed = manualSubstring(text5, indexes[0], indexes[1]);
        }

        // Step 3: Built-in trim
        String builtInTrimmed = text.trim();

        // Step 4: Compare both
        boolean result5 = compareStrings(manualTrimmed, builtInTrimmed);

        System.out.println("\nManual Trim Result: '" + manualTrimmed + "'");
        System.out.println("Built-in Trim Result: '" + builtInTrimmed + "'");
        System.out.println("Are both equal? " + result5);

        ///  ///////8
        int n = 10;
        int[] ages = new int[n];

        System.out.println("Enter age of 10 students:");

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        String[][] result6 = checkVoting(ages);
        displayResult(result6);

        //// /////////9
        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine();  // clear buffer

        String[][] gameResults = new String[totalGames][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < totalGames; i++) {

            System.out.print("\nEnter choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();

            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, totalGames);

        displayResults(gameResults, stats);

        /// ////10
        System.out.print("Enter number of students: ");
        int n1 = sc.nextInt();

        int[][] scores = generateScores(n1);

        double[][] results = calculateResults(scores);

        String[] grades = calculateGrade(results);

        displayScorecard(scores, results, grades);

    }
    private static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
    }

    private static String[] calculateGrade(double[][] results) {
        return new String[0];
    }
}
