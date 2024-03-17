package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Magazin {

    public static String[] firma = {"Rolex", "Omega", "Cartier"};
    public static String[][] model = {
            {"Submariner", "Datejust", "Daytona"},
            {"Speedmaster", "Seamaster", "De Ville"},
            {"Tank", "Santos", "Ballon Bleu"}
    };
    public static List<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание списка позиций в магазине
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < firma.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                items.add(new Item(firma[i], model[i][j]));
            }
        }

        // Создание заказов
        while (true) {
            System.out.println("Введите ФИО покупателя:");
            String name = scanner.nextLine();

            System.out.println("Введите email покупателя:");
            String email = scanner.nextLine();

            System.out.println("Введите номер телефона покупателя:");
            String phone = scanner.nextLine();

            // Выбор позиции товара
            System.out.println("Выберите позицию товара:");
            for (Item item : items) {
                System.out.println(item.getCompany() + " " + item.getModel());
            }
            String company = scanner.nextLine();
            String model = scanner.nextLine();

            System.out.println("Введите количество:");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            // Создание заказа
            Order order = new Order(name, email, phone, company, model, quantity);
            orders.add(order);

            // Вывод заказа
            System.out.println("Заказ:");
            System.out.println("Покупатель: " + order.getName());
            System.out.println("Email: " + order.getEmail());
            System.out.println("Телефон: " + order.getPhone());
            System.out.println("Позиция товара: " + order.getCompany() + " " + order.getModel());
            System.out.println("Количество: " + order.getQuantity());

            // Продолжить или выйти
            System.out.println("Продолжить ввод заказов? (y/n)");
            String answer = scanner.nextLine();
            if (answer.equals("n")) {
                break;
            }
        }

        // Вывод всех заказов
        System.out.println("Все заказы:");
        for (Order order : orders) {
            System.out.println("Покупатель: " + order.getName());
            System.out.println("Email: " + order.getEmail());
            System.out.println("Телефон: " + order.getPhone());
            System.out.println("Позиция товара: " + order.getCompany() + " " + order.getModel());
            System.out.println("Количество: " + order.getQuantity());
        }
    }

    public static class Item {
        public String company;
        public String model;
        public Item(String company, String model) {
            this.company = company;
            this.model = model;
        }
        public String getCompany() {
            return company;
        }
        public String getModel() {
            return model;
        }
    }

    public static class Order {
        public String name;
        public String email;
        public String phone;
        public String company;
        public String model;
        public int quantity;

        public Order(String name, String email, String phone, String company, String model, int quantity) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.company = company;
            this.model = model;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }
        public String getEmail() {
            return email;
        }
        public String getPhone() {
            return phone;
        }
        public String getCompany() {
            return company;
        }
        public String getModel() {
            return model;
        }
        public int getQuantity() {
            return quantity;
        }
    }
}

