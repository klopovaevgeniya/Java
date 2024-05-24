package org.example;

public class Main {
    private static Log log;

    static {
        try {
            log = new Log(Main.class.getName(), "Main.log");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        log.logger.info("Запуск приложения.");

        Prison prison = new Prison(30);
        log.logger.info("Создан объект Prison с 30 заключёнными.");
        prison.countPrisoners();
        prison.lockdown();
        prison.exerciseYard();
        prison.mailCall();
        prison.paroleHearing();
        prison.visitorRegistration();
        prison.contrabandCheck();
        prison.solitaryConfinement();

        log.logger.info("Переход к следующему объекту.");

        Prison openPrison = new OpenPrison(20);
        log.logger.info("Создан объект OpenPrison с 20 заключёнными.");
        openPrison.countPrisoners();
        openPrison.lockdown();
        openPrison.exerciseYard();
        openPrison.mailCall();
        openPrison.paroleHearing();
        openPrison.visitorRegistration();
        openPrison.contrabandCheck();
        openPrison.solitaryConfinement();

        log.logger.info("Переход к следующему объекту.");

        Prison closedPrison = new ClosedPrison(50);
        log.logger.info("Создан объект ClosedPrison с 50 заключёнными.");
        closedPrison.countPrisoners();
        closedPrison.lockdown();
        closedPrison.exerciseYard();
        closedPrison.mailCall();
        closedPrison.paroleHearing();
        closedPrison.visitorRegistration();
        closedPrison.contrabandCheck();
        closedPrison.solitaryConfinement();

        log.logger.info("Завершение приложения.");
    }
}
