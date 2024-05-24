package org.example;

import java.util.Scanner;
import java.util.logging.Level;

public class Prison {
    private static Log log;
    private int totalPrisoners;

    static {
        try {
            log = new Log(Prison.class.getName(), "Prison.log");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Prison(int totalPrisoners) {
        this.setTotalPrisoners(totalPrisoners);
        log.logger.log(Level.INFO, "Prison объект создан с {0} заключёнными.", totalPrisoners);
    }

    public void countPrisoners() {
        log.logger.log(Level.INFO, "Подсчёт количества заключённых.");
        System.out.println("Общее количество заключённых в тюрьме: " + getTotalPrisoners());
    }

    public void lockdown() {
        log.logger.log(Level.WARNING, "Тюрьма находится в режиме полной изоляции.");
        System.out.println("Тюрьма находится в режиме полной изоляции.");
    }

    public void visitationHours() {
        log.logger.log(Level.INFO, "Часы посещений для заключённых.");
        System.out.println("Часы посещений для заключённых: с 10:00 до 12:00.");
    }

    public void exerciseYard() {
        log.logger.log(Level.INFO, "Время для прогулки.");
        System.out.println("Время для прогулки.");
    }

    public void mailCall() {
        log.logger.log(Level.INFO, "Проверка почты для заключённых.");
        System.out.println("Проверка почты для заключённых.");
    }

    public void paroleHearing() {
        log.logger.log(Level.INFO, "Заседание по делу УДО.");
        System.out.println("Заседание по делу УДО.");
    }

    public void visitorRegistration() {
        log.logger.log(Level.INFO, "Регистрация посетителей.");
        visitationHours();
        System.out.println("Процедура регистрации посетителей.");
    }

    public void contrabandCheck() {
        log.logger.log(Level.WARNING, "Проверка на контрабанду.");
        System.out.println("Проверка на контрабанду.");
    }

    public void solitaryConfinement() {
        log.logger.log(Level.WARNING, "Заключение в одиночную камеру.");
        lockdown();
        System.out.println("Заключение в одиночную камеру.");
    }

    public int getTotalPrisoners() {
        return totalPrisoners;
    }

    public void setTotalPrisoners(int totalPrisoners) {
        this.totalPrisoners = totalPrisoners;
        log.logger.log(Level.INFO, "Общее количество заключённых установлено в {0}.", totalPrisoners);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Prison prison = new Prison(30);

        do {
            System.out.println("Меню:");
            System.out.println("1. Подсчёт количества заключённых");
            System.out.println("2. Режим полной изоляции");
            System.out.println("3. Прогулка на улице");
            System.out.println("4. Проверка почты");
            System.out.println("5. Заседание по делу УДО");
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
                    log.logger.log(Level.INFO, "Выход из программы.");
                    System.out.println("Выход из программы.");
                    break;
                default:
                    log.logger.log(Level.WARNING, "Неверный выбор: {0}", choice);
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 0);

        scanner.close();
        log.logger.log(Level.INFO, "Сканер закрыт и программа завершена.");
    }
}
