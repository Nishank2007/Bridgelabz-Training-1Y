package com.gla.String.Level3;

import java.util.Scanner;

import static com.gla.String.Level3.BMIProgram.calculateBMI;
import static com.gla.String.Level3.BMIProgram.display;
import static com.gla.String.Level3.CardGame.*;

public class Runner {

    private static PalindromicLogic PalindromeLogic;

    public static void main(String[] args) {
            /// ////////////////////////////////////////////////1
            Scanner sc = new Scanner(System.in);
            double[][] data = new double[10][2];

            for (int i = 0; i < 10; i++) {
                System.out.println("\nEnter details of Person " + (i + 1));
                System.out.print("Weight (kg): ");
                data[i][0] = sc.nextDouble();
                System.out.print("Height (cm): ");
                data[i][1] = sc.nextDouble();
            }

            String[][] result = calculateBMI(data);
            display(result);

            sc.close();

            /// ////////////////////////////////////////////////2
            Scanner scanObj = new Scanner(System.in);

            System.out.print("Enter text: ");
            String userValue = scanObj.next();

            char[] outputArr = UniqueCharacters.findUniqueCharacters(userValue);

            System.out.println("Unique characters:");
            for (int idx = 0; idx < outputArr.length; idx++) {
                System.out.print(outputArr[idx] + " ");
            }

            scanObj.close();

            /// /////////////////////////////////////////////////3
            Scanner inputObj = new Scanner(System.in);

            System.out.print("Enter string: ");
            String userStr = inputObj.next();

            char resultChar = FirstNonRepeating.findFirstNonRepeating(userStr);

            if (resultChar != '\0') {
                System.out.println("First non-repeating character is: " + resultChar);
            } else {
                System.out.println("No non-repeating character found");
            }

            inputObj.close();

            /// //////////////////////////////////////////////////////4
            Scanner scanRef = new Scanner(System.in);

            System.out.print("Enter string: ");
            String userInput = scanRef.next();

            char[][] outputData = CharacterFrequency.findFrequency(userInput);

            System.out.println("Character  Frequency");
            for (int i = 0; i < outputData.length; i++) {
                System.out.println(outputData[i][0] + "          " + (int) outputData[i][1]);
            }

            scanRef.close();

            /// ///////////////////////////////////////////5
            Scanner scanObj1 = new Scanner(System.in);

            System.out.print("Enter string: ");
            String userText = scanObj1.next();

            String[][] outputTable = UniqueFrequency.findFrequency(userText);

            System.out.println("Character  Frequency");
            for (int row = 0; row < outputTable.length; row++) {
                System.out.println(outputTable[row][0] + "          " + outputTable[row][1]);
            }

            scanObj1.close();

            /// ////////////////////////////////////////////6
            Scanner scanVal = new Scanner(System.in);

            System.out.print("Enter string: ");
            String userInput1 = scanVal.next();

            String[] outputArr1 = NestedFrequency.findFrequency(userInput1);

            System.out.println("Character Frequencies:");
            for (int i = 0; i < outputArr1.length; i++) {
                System.out.println(outputArr1[i]);
            }

            scanVal.close();

            /// //////////////////////////////////////////////////7
            Scanner scanObj2 = new Scanner(System.in);

            System.out.print("Enter text: ");
            String userText2 = scanObj2.next();

            boolean result1 = PalindromeLogic.isPalindromeLoop(userText2);
            boolean result2 = PalindromeLogic.isPalindromeRecursive(userText2, 0, userText2.length() - 1);
            boolean result3 = PalindromeLogic.isPalindromeArray(userText2);

            System.out.println("\nPalindrome Check Results:");
            System.out.println("Logic 1 (Loop): " + result1);
            System.out.println("Logic 2 (Recursion): " + result2);
            System.out.println("Logic 3 (Array): " + result3);

            scanObj2.close();

            ///  /////////////////////////////////////////////////8
            Scanner scanTool = new Scanner(System.in);

            System.out.print("Enter first text: ");
            String valueOne = scanTool.next();

            System.out.print("Enter second text: ");
            String valueTwo = scanTool.next();

            boolean finalResult = AnagramCheck.checkAnagram(valueOne, valueTwo);

            if (finalResult) {
                System.out.println("The texts are anagrams");
            } else {
                System.out.println("The texts are not anagrams");
            }

            scanTool.close();

            /// ////////////////////////////////////////9
            Scanner scanRef1 = new Scanner(System.in);

            System.out.print("Enter month (1-12): ");
            int month = scanRef1.nextInt();

            System.out.print("Enter year: ");
            int year = scanRef.nextInt();
            CalendarLogic.displayCalendar(month, year);

            scanRef.close();

            /// ////////////////////////////////////////////////10
            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
                    "10", "Jack", "Queen", "King", "Ace"};

            // Initialize Deck
            String[] deck = initializeDeck(suits, ranks);

            // Shuffle Deck
            deck = shuffleDeck(deck);

            System.out.print("Enter number of players: ");
            int players = sc.nextInt();

            System.out.print("Enter number of cards per player: ");
            int cardsPerPlayer = sc.nextInt();

            // Distribute
            String[][] playerCards = distributeCards(deck, players, cardsPerPlayer);

            // Print
            printPlayers(playerCards);
        }


}
