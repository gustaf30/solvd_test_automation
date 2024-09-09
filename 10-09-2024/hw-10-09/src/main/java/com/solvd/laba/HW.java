package com.solvd.laba;

import com.sun.nio.sctp.AbstractNotificationHandler;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HW {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int userOp1, userOp2;
        String userInput = "";
        File inputFile = new File("C:\\Users\\gusta\\Dev\\solvd\\hw-10-09\\src\\main\\java\\com\\solvd\\laba\\input.txt");
        File outputFile = new File("C:\\Users\\gusta\\Dev\\solvd\\hw-10-09\\src\\main\\java\\com\\solvd\\laba\\output.txt");

        do {
            System.out.println(" 1 - Type text " +
                    "\n 2 - Read from file" +
                    "\n 0 - Leave");
            System.out.println("Please enter your operation: ");
            userOp1 = input.nextInt();
            input.nextLine();

            if (userOp1 == 0) break;

            if (userOp1 == 1) {
                System.out.println("Please enter your text: ");
                userInput = input.nextLine();
            } else if (userOp1 == 2) {
                userInput = FileUtils.readFileToString(inputFile, StandardCharsets.UTF_8);
            }

            FileUtils.writeStringToFile(outputFile, "\n" + LocalDateTime.now() + "\n", StandardCharsets.UTF_8, true);
            FileUtils.writeStringToFile(outputFile, userInput+ "\n", StandardCharsets.UTF_8, true);

            do {
                System.out.println(" 1 - Calculate the number of unique words in the text" +
                        " \n 2 - Calculate the number of letters in the text (without spaces)" +
                        "\n 3 - Find the number of matches of words in the text (word)" +
                        "\n 0 - Leave");
                System.out.println("Please enter your operation:");
                userOp2 = input.nextInt();
                input.nextLine();

                switch (userOp2) {
                    case 1: System.out.println(calculateWords(userInput, outputFile)); break;
                    case 2: System.out.println(calculateLetters(userInput, outputFile)); break;
                    case 3: {
                        System.out.println("Enter a word: ");
                        String word = input.nextLine();
                        if (word.length() < 2) {
                            System.out.println("Word is too short");
                            break;
                        }
                        System.out.println("Case sensitive? 1 (true) or 2 (false)");
                        userOp1 = input.nextInt();
                        input.nextLine();
                        if (userOp1 != 1 && userOp1 != 2) break;

                        System.out.println(searchMatches(userInput, word, userOp1, outputFile));
                    }
                    case 0: break;
                }
            } while (userOp2 != 0);
        } while (true);
    }

    public static int calculateWords(String input, File outputFile) throws IOException {
        Set<String> uniqueWords = new HashSet<>();
        input = StringUtils.lowerCase(input);
        String[] words = StringUtils.split(input, " ");
        uniqueWords.addAll(Arrays.asList(words));

        String output = "Unique words: " + uniqueWords.toArray().length + "\n";
        output = output.concat(StringUtils.join(uniqueWords, " "));
        output = output.concat("\n");
        FileUtils.writeStringToFile(outputFile, output, StandardCharsets.UTF_8, true);

        return uniqueWords.toArray().length;
    };

    public static int calculateLetters(String input, File outputFile) throws IOException {
        input = StringUtils.lowerCase(input);
        String join = StringUtils.join(StringUtils.split(input, " "), "");

        String output = "Number of letters: " + join.length() + "\n";
        FileUtils.writeStringToFile(outputFile, output, StandardCharsets.UTF_8, true);

        return join.length();
    }

    public static int searchMatches(String input, String word, int op, File outputFile) throws IOException {
        String[] words = StringUtils.split(input, " ");
        int total = 0;

        if (op == 1) {
            for (String w : words) {
                if (w.equals(word)) {
                    total++;
                }
            }

            String output = "Number of matching words with " + word + " (case sensitive): " + total + "\n";
            FileUtils.writeStringToFile(outputFile, output, StandardCharsets.UTF_8, true);

            return total;
        }

        if (op == 2) {
            for (String w : words) {
                if (w.equalsIgnoreCase(word)) {
                    total++;
                }
            }

            String output = "Number of matching words with " + word + " (case insensitive): " + total + "\n";
            FileUtils.writeStringToFile(outputFile, output, StandardCharsets.UTF_8, true);

            return total;
        }

        return 0;
    }
}
