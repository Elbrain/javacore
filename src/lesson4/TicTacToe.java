package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TicTacToe {
    static final int SIZE = 3;
    static final int WIN = 3;
    static int steps;
    static char[][] map = new char[SIZE][SIZE];
    static Random random = new Random();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static final char EMPTY_DOT = '•';
    static final char PLAYER_X = 'X';
    static final char PLAYER_O = 'O';
    static boolean firstTurnAi = false;
    static char ai;
    static char player;
    static final String EMPTY = " ";


    public static void main(String[] args) throws IOException {
        gameStart();
    }

    static void gameStart() throws IOException {
        gameInitialize();
        chooseTurn();
        printMap();
        playGame();
    }

    static void gameInitialize(){
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE ; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    static void chooseTurn() throws IOException {
        boolean isTrue = true;
        while (isTrue){
            System.out.println("Кто будет делать ход первым? Введите 1 или 2;  1 - игрок, 2 - компьютер");
            switch (Integer.parseInt(reader.readLine())) {
                case 1 -> {
                    player = PLAYER_X;
                    ai = PLAYER_O;
                    System.out.println("Игрок ходит первым");
                    isTrue = false;
                }
                case 2 -> {
                    ai = PLAYER_X;
                    player = PLAYER_O;
                    System.out.println("Компьютер ходит первым");
                    firstTurnAi = true;
                    isTrue = false;
                }
                default -> System.out.println("Неверное значение, введите еще раз");
            }
        }
    }

    static void printMap() {
        printMapHeader();
        printMapRows();
    }

    static void playGame() throws IOException {
        if (firstTurnAi){
            aiTurn();
            printMap();
        }
        while (true){
            humanTurn();
            printMap();
            checkEnd(player);
            aiTurn();
            printMap();
            checkEnd(ai);
        }
    }

    static void printMapHeader(){
        System.out.println();
        System.out.print(EMPTY + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    static void printMapRows(){
        for (int i = 0; i < SIZE ; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    static void printMapNumber(int i){
        System.out.print((i+1) + EMPTY);
    }

    static void humanTurn() throws IOException {
        int rowNumber;
        int colNumber;
        steps++;
        System.out.println("\nХод человека.Введите координаты строка/столбец");
        do {
            System.out.print("Строка = ");
            rowNumber = Integer.parseInt(reader.readLine());
            System.out.print("Столбец = ");
            colNumber = Integer.parseInt(reader.readLine());
        }while (!isCellValid(rowNumber, colNumber));
        map[rowNumber-1][colNumber-1] = player;

    }

    private static boolean isCellValid(int rowNumber, int colNumber) {
        if (rowNumber < 1 || rowNumber > SIZE || colNumber < 1 || colNumber > SIZE){
            System.out.println("Значения не соотвествуют полю. Введите еще раз");
            return false;
        }
        if (map[rowNumber-1][colNumber-1] != EMPTY_DOT){
            System.out.println("Вы выбрали занятую ячейку, введите еще раз");
            return false;
        }
        return true;
    }

    private static void aiTurn() {
        int rowNumber;
        int colNumber;
        steps++;
        System.out.println("\nХод компьютера");
        do {
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        }while (!isAiCellValid(rowNumber, colNumber));
        map[rowNumber-1][colNumber-1] = ai;
    }

    private static boolean isAiCellValid(int rowNumber, int colNumber) {
        return map[rowNumber - 1][colNumber - 1] == EMPTY_DOT;
    }

    private static void checkEnd(char currentPlayer) {
        boolean isEnd = false;
        if (checkWin(currentPlayer)){
            if (currentPlayer == player)
            System.out.println("Игрок победил");
            if (currentPlayer == ai)
                System.out.println("Компьютер победил.");
            isEnd = true;
        }

        if (!isEnd && isMapFull()){
            System.out.println("Ничья!");
            isEnd = true;
        }
        if (isEnd){
            System.out.println("Игра окончена");
            System.exit(0);
        }
    }

    private static boolean checkWin(char symbol) {
        int col,row,diag = 0, rdiag = 0;
        for (int i = 0; i < SIZE; i++) {
            row = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) row++;
                if (row == WIN) return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            col= 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symbol) col++;
                if (col == WIN) return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) diag++;
            if (diag==WIN) return true;
        }
        for (int i = SIZE - 1,j = 0; i >= 0 && j < SIZE; i--,j++){
            if (map[i][j] == symbol) rdiag++;
            if (rdiag == WIN) return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        return steps == SIZE * SIZE;
    }
}
