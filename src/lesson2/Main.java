package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] arr1 = {1, 2, 3, 4, 5};
        arrayOneAndZero();   //Задание 1
        System.out.println();
        arrayOfEight();     //Задание 2
        System.out.println();
        arrayLessThanSix(); //Задание 3
        System.out.println();
        diagonalArray(); //Задание 4
        System.out.println();
        minMax(); //Задание 5
        System.out.println();
        System.out.println(checkBalance(arr)); //Задание 6
        System.out.println();
        moveNumber(arr1, -2);   //Задание 7
    }

    static void arrayOneAndZero(){   //Задание 1
        int[] arr = {1,1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Оригинальный массив - " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        System.out.println("Массив после цикла - " + Arrays.toString(arr));
    }

    static void arrayOfEight (){    //Задание 2
        int[] arr = new int[8];
        int factor = 0;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = factor;
            factor = factor + 3;
        }
        System.out.println("Массив после заполнения - " + Arrays.toString(arr));
    }

    static void arrayLessThanSix(){     //Задание 3
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Оригинальный массив - " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
        }
        System.out.println("Массив после цикла - " + Arrays.toString(arr));
    }

    static void diagonalArray(){    //Задание 4
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i || j == arr.length - 1 - i)
                    arr[i][j] = 1;
                }
            }
        for (int[] ints:arr) {
            for (int anInt:ints) {
                System.out.printf("%2d", anInt);
            }
            System.out.println();
        }
    }

    static void minMax(){   //Задание 5
        int[] arr = {13, 52, 13, 2, 11, 44, 5, 12, 4, 8, 19, 1};
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        System.out.println("Оригинальный массив - " + Arrays.toString(arr));
        for (int value : arr) {
            if (value < min)
                min = value;
            if (value > max)
                max = value;
        }
        System.out.println("Минимальное значение - " + min);
        System.out.println("Максимальное значение - " + max);
    }

    static boolean checkBalance(int[] arr){     //Задание 6
        int left = 0;
        int right;
        for (int i = 0; i < arr.length ; i++) {
            left = left + arr[i];
            right = 0;
            for (int j = i+1; j < arr.length ; j++) {
                right = right + arr[j];
            }
            if (left == right)
            return true;

        }
        return false;
    }

    static void moveNumber(int[] arr, int n){       //Задание 7
        int bucket;
        System.out.println("Оригинальный массив - " + Arrays.toString(arr));
        if (n > 0){     //положительный сдвиг
            for (int i = 0; i < n; i++) {
                for (int j = arr.length-1; j > 0 ; j--) {
                    bucket = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = bucket;

                }
            }
        } else if (n < 0){      //отрицательный сдвиг
            for (int i = 0; i > n; i--) {
                for (int j = 1; j < arr.length ; j++) {
                    bucket = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = bucket;

                }
            }
        }

        System.out.println("Массив после сдвига на " + n + " позиции - " + Arrays.toString(arr));
    }
}

