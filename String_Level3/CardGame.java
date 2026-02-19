package com.gla.String.Level3;

public class CardGame {
    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    // b) Shuffle Deck (Manual Method)
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Swap
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // c) Distribute Cards
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];

        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }

        return playerCards;
    }

    // d) Print Players and Their Cards
    public static void printPlayers(String[][] playerCards) {

        if (playerCards == null)
            return;

        for (int i = 0; i < playerCards.length; i++) {

            System.out.println("\nPlayer " + (i + 1) + " Cards:");

            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.println(playerCards[i][j]);
            }
        }
    }
}
