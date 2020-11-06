package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class NumberGuess {

    static Random random = new Random();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        startGame();
    }

    public static void startGame() throws IOException {
        int randomNumber = random.nextInt(10);
        System.out.println("У вас есть 3 попытки угадать число от 0 до 9. Удачи!");
        userInput(randomNumber);
        System.out.println("Повторить игру? 1 - да, 0 - нет");
        if (Integer.parseInt(reader.readLine()) == 1){
            startGame();
        }
    }
    public static void userInput(int randomNumber) throws IOException {
        int guess = 1;
        while (guess < 4){
            System.out.print("Попытка номер " + guess + ". Введите число: ");
            if (randomNumber == Integer.parseInt(reader.readLine())){
                System.out.println("Вы угадали число с " + guess + " попытки! Поздравляем");
                break;
            } else {
                System.out.println("Мимо. Пробуйте еще!");
            }
            guess++;
        }
    }
}
