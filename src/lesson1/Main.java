package lesson1;

public class Main {
    public static void main(String[] args) {
        // Задание 2. Переменные.
        byte smallestNumber = 125;
        short smallNumber = 1843;
        int number = 35982;
        long longNumber = 9334123;
        double doubleNumber = 34212.32;
        float floatNumber = 38.34f;
        boolean isTrue = true;
        char sex = 'M';
        String str = "String text";

        System.out.println(expression(2, 4, 5, 3));     //Задание 3.
        System.out.println(sumCompare(2, 14));      //Задание 4.
        numberCheck(1);     //Задание 5.
        System.out.println(negativeNumberCheck(-5));    //Задание 6.
        greetings("Тимофей");   //Задание 7.
        yearCheck(2020);    //Задание 8.

    }
    static double expression(int a, int b, double c, int d){    //Задание 3.
        return  a * (b + (c  / d));
    }

    static boolean sumCompare ( int a, int b){  //Задание 4.
        return (a + b >= 10 && a + b <=20);
    }

    static void numberCheck (int number){   //Задание 5.
        if (number >= 0)
            System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }
    static boolean negativeNumberCheck (int number){    //Задание 6.
        return number < 0;
    }
    static void greetings (String name){    //Задание 7.
        System.out.println("Привет " + name + "!");
    }

    static void yearCheck (int year){   //Задание 8.
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("Год високосный");
        else System.out.println("Год не високосный");
    }
}

