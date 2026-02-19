package com.gla.String.Level2;

public class RockPaperScissor {
    public static String getComputerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // c) Method to find winner
    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer))
            return "Draw";
        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = ((double) userWins / totalGames) * 100;
        double compPercent = ((double) compWins / totalGames) * 100;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent);

        return stats;
    }

    // e) Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" +
                    gameResults[i][2]);
        }

        System.out.println("\nOverall Stats:");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("--------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%");
        }
    }
}
