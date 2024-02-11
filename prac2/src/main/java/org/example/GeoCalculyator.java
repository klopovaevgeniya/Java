package org.example;
import java.util.Scanner;

public class GeoCalculyator { // создание класса
    private static final double EARTH_RADIUS = 6371; // радиус Земли в километрах

    public static void main(String[] args) { // объявление метода main
        Scanner scanner = new Scanner(System.in); // объявление инициализации типа Scanner

        System.out.println("Введите широту и долготу первой точки:"); // вывод строки
        double shir1 = scanner.nextDouble(); // вводим широту 1
        double dolg1 = scanner.nextDouble(); // вводим долготу 1

        System.out.println("Введите широту и долготу второй точки:"); // вывод строки
        double shir2 = scanner.nextDouble(); // вводим широту 2
        double dolg2 = scanner.nextDouble(); // вводим долготу 2

        double distance = Distance(shir1, dolg1, shir2, dolg2); // расчёт дистанции в км
        System.out.println("Расстояние между двумя точками: " + distance + " км"); // вывод строки
    }

    public static double Distance(double shir1, double dolg1, double shir2, double dolg2) { // объявление метода
        double shir1Rad = Math.toRadians(shir1);
        double dolg1Rad = Math.toRadians(dolg1);
        double shir2Rad = Math.toRadians(shir2);
        double dolg2Rad = Math.toRadians(dolg2); // переводим градусы в радианы

        double diffLon = shir2Rad - shir1Rad; // вычисляем разницу между долготой точек

        // используем формулу гаверсинусов для вычисления расстояния
        double a = Math.pow(Math.sin((shir2Rad - shir1Rad) / 2), 2) +
                Math.cos(shir1Rad) * Math.cos(shir2Rad) *
                        Math.pow(Math.sin(diffLon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS * c;
    }
}

