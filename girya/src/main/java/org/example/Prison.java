package org.example;
import java.util.Scanner;

public class Prison {
    private int totalPrisoners;

    public Prison(int totalPrisoners) {
        this.setTotalPrisoners(totalPrisoners);
    }

    public void countPrisoners() {
        System.out.println("Общее количество заключенных в тюрьме: " + getTotalPrisoners());
    }

    public void lockdown() {
        System.out.println("Тюрьма находится в режиме полной изоляции.");
    }

    public void visitationHours() {
        System.out.println("Часы посещений для заключенных: с 10:00 до 12:00.");
    }

    public void exerciseYard() {
        System.out.println("Время для прогулки.");
    }

    public void mailCall() {
        System.out.println("Проверка почты для заключенных.");
    }

    public void paroleHearing() {
        System.out.println("Заседание по делу удо.");
    }

    public void visitorRegistration() {
        visitationHours();
        System.out.println("Процедура регистрации посетителей.");
    }

    public void contrabandCheck() {
        System.out.println("Проверка на контрабанду.");
    }

    public void solitaryConfinement() {
        lockdown();
        System.out.println("Заключение в одиночную камеру.");
    }

    public int getTotalPrisoners() {
        return totalPrisoners;
    }

    public void setTotalPrisoners(int totalPrisoners) {
        this.totalPrisoners = totalPrisoners;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Prison prison = new Prison(30);

        do {
            System.out.println("Меню:");
            System.out.println("1. Подсчет количества заключенных");
            System.out.println("2. Режим полной изоляции");
            System.out.println("3. Прогулка на улице");
            System.out.println("4. Проверка почты");
            System.out.println("5. Заседание по делу удо");
            System.out.println("6. Регистрация посетителей");
            System.out.println("7. Проверка на контрабанду");
            System.out.println("8. Заключение в одиночную камеру");
            System.out.println("0. Выход");

            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    prison.countPrisoners();
                    break;
                case 2:
                    prison.lockdown();
                    break;
                case 3:
                    prison.exerciseYard();
                    break;
                case 4:
                    prison.mailCall();
                    break;
                case 5:
                    prison.paroleHearing();
                    break;
                case 6:
                    prison.visitorRegistration();
                    break;
                case 7:
                    prison.contrabandCheck();
                    break;
                case 8:
                    prison.solitaryConfinement();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 0);

        scanner.close();
    }
}