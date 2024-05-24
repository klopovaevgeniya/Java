package org.example;

import java.util.logging.Level;

public class OpenPrison extends Prison {

    static Log myLog;

    static {
        try {
            myLog = new Log(OpenPrison.class.getName(), "OpenPrison.log");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public OpenPrison(int totalPrisoners) {
        super(totalPrisoners);
        myLog.logger.log(Level.INFO, "Создан объект OpenPrison с {0} заключёнными.", totalPrisoners);
    }

    @Override
    public void lockdown() {
        myLog.logger.log(Level.WARNING, "В открытой тюрьме нет полной изоляции.");
        System.out.println("В открытой тюрьме нет полной изоляции.");
    }

    @Override
    public void solitaryConfinement() {
        myLog.logger.log(Level.WARNING, "В открытой тюрьме нет одиночных камер.");
        System.out.println("В открытой тюрьме нет одиночных камер.");
    }
}
