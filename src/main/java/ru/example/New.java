package ru.example;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class New {

    /*Выведите в консоль числа от 1 до 100, при этом, если число делится на 3 - выведите слово "three", если делится на 5 - "five", если на 15 - "fifteen".
     */
    public static void main(String[] args) {

        /*
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                if (i % 15 == 0) {
                    System.out.println("fifteen");
                } else {
                    System.out.println("three");
                }
            } else if (i % 5 == 0) {
                if (i % 15 == 0) {
                    System.out.println("fifteen");
                } else {
                    System.out.println("five");
                }
            } else {
                System.out.println(i);
            }

        }
    }

         */

        /*
        Создайте массив из 20 элементов, наполненный рандомными значениями в диапазоне (-50, 50) и реализуйте метод его сортировки
        (без использования сторонних библиотек).
	    Вывести сам массив и сортированный массив
         */
/*
        Random random = new Random();

        int[] first = new int[20];
        int[] second = new int[20];

        for (int i = 0; i < 20; i++) {
            first[i] = random.nextInt(50);
            System.out.print(first[i] + " ");
        }
*/

        Random random = new Random();

        int upperBound = 51;
        int[] first = new int[20];

        for (int i = 0; i < 20; i++) {
            boolean choose = random.nextBoolean();
            if (choose) {
                first[i] = random.nextInt(upperBound);
                System.out.print(first[i] + " ");
            } else {
                first[i] = random.nextInt(upperBound) * -1;
                System.out.print(first[i] + " ");
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = i + 1; j < 20; j++) {
                int temp;
                if (first[i] > first[j]) {
                    temp = first[i];
                    first[i] = first[j];
                    first[j] = temp;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(first[i] + " ");
        }

    }

}
