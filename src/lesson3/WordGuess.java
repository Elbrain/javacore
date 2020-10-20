package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class WordGuess {

    static Random random = new Random();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};


    public static void main(String[] args) throws IOException {
        gameStart();
    }

    public static void gameStart() throws IOException {
        int wordNumber = random.nextInt(words.length);
        System.out.println("Отдгадайте слово из массива");
        System.out.println(Arrays.toString(words));
        //System.out.println("Загаданное слово - " + words[wordNumber]);
        userGuess(wordNumber);

    }

    public static void userGuess(int number) throws IOException {
        int guessNumber = 0;
        while (true) {
            System.out.print("Отгадайте слово : ");
            String userGuess = reader.readLine();
            guessNumber++;
            if (userGuess.equals(words[number])) {
                System.out.println("Вы угадали c "+ guessNumber + " попытки. Поздравляем");
                break;
            } else {
                System.out.println("Вы не угадали, но некоторые буквы совпали : ");
                letterCompare(userGuess, number);
                System.out.println("Попробуйте еще разок!");
            }
        }
    }

    public static void letterCompare(String userGuess, int number){
        int min;
        char[] hiddenWord = new char[15];
        if (userGuess.length() < words[number].length())
            min = userGuess.length();
        else min = words[number].length();
        Arrays.fill(hiddenWord, '#');

        for (int i = 0; i < min; i++) {
            if (userGuess.charAt(i) == words[number].charAt(i)){
                hiddenWord[i] = userGuess.charAt(i);
            }
        }
        for (char c : hiddenWord) {
            System.out.print(c);
        }
        System.out.println();
    }
}
