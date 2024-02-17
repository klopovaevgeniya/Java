package org.example;
import java.util.Scanner;

public class Treugolnyk { // объявляем класс
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаём новый сканнер для считывания клавиатуры

        System.out.println("Введите три стороны треугольника:"); // вывод строки
        System.out.println("Введите a:"); int a = scanner.nextInt(); // ввод данных
        System.out.println("Введите b:"); int b = scanner.nextInt(); // ввод данных
        System.out.println("Введите c:"); int c = scanner.nextInt(); // ввод данных

        if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b)) { // для прямоугольного
            System.out.println(" Это прямоугольный треугольник"); // вывод строки
        } else if ((a == b) || (b == c) || (c == a)) { // для равнобедренного
            System.out.println("Это равнобедренный треугольник"); // вывод строки
        } else if ((a == b) && (b == c)) { // для равностороннего
            System.out.println(" Это равносторонний треугольник"); // вывод строки
        } else if (!(a + b > c) && (b + c > a) && (c + a > b)) { // для не треугольника
            System.out.println(" Это не треугольник"); // вывод строки
        } else { //для произвольного треугольника
            System.out.println(" Это призовльный треугольнк"); // вывод строки
        }
    }
}
