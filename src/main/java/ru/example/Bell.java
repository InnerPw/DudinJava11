package ru.example;

import java.util.Random;
import java.util.Scanner;

public class Bell {
    public static void main(String[] args) {
        //countVowels("Aliababa");
        //randomizer();
        arrFunc(3, 3);
    }

    public static void countVowels(String str) {

        int count = 0;

        System.out.println("Слово: " + str);
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
            }
        }

        System.out.println("Количество гласных: " + count);

    }

    public static void randomizer() {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = new Random().nextInt(100) + 1;
        int count = 0;

        while (true) {

            System.out.print("Введите число: ");

            int inputNumber = scanner.nextInt();
            //System.out.println("Нужное число: " + randomNumber);

            if (inputNumber == randomNumber) {
                System.out.println("Вы угадали");
                count++;
                System.out.println("Количество попыток: " + count);
                break;
            } else if (inputNumber < randomNumber) {
                System.out.println("Слишком мало");
                count++;
            } else {
                System.out.println("Слишком много");
                count++;
            }

        }

    }

    public static void arrFunc(int N, int M) {

        Random random = new Random();

        int[][] arrayStart = new int[N][M];
        int[][] arrayFinish = new int[N][M];

        //заполнение первого массива
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arrayStart[i][j] = random.nextInt(9) + 1;
                System.out.print(" " + arrayStart[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //заполнение второго массива

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                int nextNumberA, nextNumberB, nextNumberC, nextNumberD;

                if (i > 0) {
                    nextNumberA = arrayStart[i-1][j];
                } else nextNumberA = 0;

                if (j > 0) {
                    nextNumberB = arrayStart[i][j-1];
                } else nextNumberB = 0;

                if ((j+1) < M) {
                    nextNumberC = arrayStart[i][j+1];
                } else nextNumberC = 0;

                if ((i+1) < N) {
                    nextNumberD = arrayStart[i+1][j];
                } else nextNumberD = 0;

                arrayFinish[i][j] = nextNumberA + nextNumberB + nextNumberC + nextNumberD;
                System.out.print(" " + arrayFinish[i][j] + " ");
            }
            System.out.println();
        }

    }

}
