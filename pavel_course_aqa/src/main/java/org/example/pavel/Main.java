package org.example.pavel;

public class Main {

    // Задание 2
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // Задание 3
    public static void checkSumSign() {
        int a = 5;
        int b = 28;
        if (a + b >= 0) {
            System.out.println("\"Сумма положительная\"");
        } else {
            System.out.println("\"Сумма отрицательная\"");
        }
    }

    // Задание 4
    public static void printColor() {
        int value = -12;
        if (value <= 0) {
            System.out.println("\"Красный\"");
        } else if (value <= 100) {
            System.out.println("\"Желтый\"");
        } else {
            System.out.println("\"Зеленый\"");
        }

    }

    // Задание 5
    public static void compareNumbers() {
        int a = 12;
        int b = 2;
        if (a + b >= 0) {
            System.out.println(a+ ">="+b);
        } else {
            System.out.println(a+ "<"+b);
        }

    }

    public static void main(String[] args) {
        {
            System.out.println("Задание 2:");
            printThreeWords();
            System.out.println("\nЗадание 3:");
            checkSumSign();
            System.out.println("\nЗадание 4:");
            printColor();
            System.out.println("\nЗадание 5:");
            compareNumbers();

        }
    }
}