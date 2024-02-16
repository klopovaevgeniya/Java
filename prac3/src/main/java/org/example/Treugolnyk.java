package org.example;

import java.util.Scanner;

public class Treugolnyk { // объявляем класс
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаём новый сканнер для считывания клавиатуры

        System.out.println("Введите три стороны треугольника:"); // вывод строки
        int a = scanner.nextInt(); // ввод данных
        int b = scanner.nextInt(); // ввод данных
        int c = scanner.nextInt(); // ввод данных

        if (RightTriangle(a, b, c)) { // цикл для определения треугольника
            System.out.println(a + ", " + b + " и " + c + " это прямоугольный треугольник"); // вывод строки
        } else if (isBedroTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " это равнобедренный треугольник"); // вывод строки
        } else if (isStoronalTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " это равносторонний треугольник"); // вывод строки
        } else if (!isTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " это не треугольник"); // вывод строки
        } else {
            System.out.println(a + ", " + b + " и " + c + " это призовльный треугольнк"); // вывод строки
        }
    }

    public static boolean RightTriangle(int a, int b, int c) { // проверка на тип треугольника
        return (a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b); // возврат команды после удачной проверки
    }

    public static boolean isBedroTriangle(int a, int b, int c) { // проверка на равнобедренный треугольник
        return (a == b) || (b == c) || (c == a);
    }

    public static boolean isStoronalTriangle(int a, int b, int c) { // проверка на равносторонний треугольник
        return (a == b) && (b == c);
    }

    public static boolean isTriangle(int a, int b, int c) { // проверка на треугольник
        return (a + b > c) && (b + c > a) && (c + a > b);
    }
}
