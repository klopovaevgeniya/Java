package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Magazin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firma = {"Rolex", "Omega", "Cartier"};
        String[] model = {"Submariner", "Datejust", "Daytona", "Speedmaster", "Seamaster", "De Ville", "Tank", "Santos", "Ballon Bleu"};
        Object[][] mixedArray = new Object[][]{
                {firma[0], model[0]},
                {firma[0], model[1]},
                {firma[0], model[2]},
                {firma[1], model[3]},
                {firma[1], model[4]},
                {firma[1], model[5]},
                {firma[2], model[6]},
                {firma[2], model[7]},
                {firma[2], model[8]},
        };

        ArrayList<Object[]> orders = new ArrayList<>();

        while (true) {
            System.out.println("Введите ФИО покупателя:");
            String name = scanner.nextLine();

            System.out.println("Введите email покупателя:");
            String email = scanner.nextLine();

            System.out.println("Введите номер телефона покупателя:");
            String phone = scanner.nextLine();

            for (int i = 0; i < 3; i++) {

                System.out.println("Выберите фирму часов");
                for (int j = 0; j < firma.length; j++) {
                    System.out.println((j + 1) + " " + firma[j]);
                }
                int choice = Integer.parseInt(scanner.nextLine()) - 1;

                System.out.println("Выберите модель часов");
                for (int j = 0; j < model.length; j++) {
                    if (mixedArray[j][0].equals(firma[choice])) {
                        System.out.println((j + 1) + " " + model[j]);
                    }
                }
                int choice2 = Integer.parseInt(scanner.nextLine()) - 1;
            }
            System.out.println("Введите количество:");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            // Создание заказа
            orders.add(new Object[]{name, email, phone, firma, model, quantity});

            // Вывод заказа
            System.out.println("Заказ:");
            System.out.println("Покупатель: " + name);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phone);
            System.out.println("Позиция товара: " + Arrays.toString(firma) + " " + Arrays.toString(model));
            System.out.println("Количество: " + quantity);

            // Продолжить или выйти
            System.out.println("Продолжить ввод заказов? (да/нет)");
            String answer = scanner.nextLine();
            if (answer.equals("нет")) {
                break;
            }
        }

        // Вывод всех заказов
        System.out.println("Все заказы:");
        for (Object[] order : orders) {
            System.out.println("Покупатель: " + order[0]);
            System.out.println("Email: " + order[1]);
            System.out.println("Телефон: " + order[2]);
            System.out.println("Позиция товара: " + order[3] + " " + order[4]);
            System.out.println("Количество: " + order[5]);
        }
    }
}
