package ru.example;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cond = 1;

        System.out.print("Введите строку а: ");
        String a = scanner.next();

        System.out.print("Введите строку b: ");
        String b = scanner.next();

        if (a.length() == b.length()){
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    System.out.println("Строки неидентичны");
                    cond = 0;
                    break;
                }
            }
            if (cond == 1) {
                System.out.println("Строки идентичны");
            }
        } else {
            System.out.println("Строки неидентичны");
        }

    }

}
