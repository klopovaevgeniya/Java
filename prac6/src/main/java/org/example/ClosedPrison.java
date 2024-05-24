package org.example;

import java.io.IOException;
import java.util.logging.Level;

public class ClosedPrison extends Prison {

    static Log myLog;

    static {
        try {
            myLog = new Log(ClosedPrison.class.getName(), "ClosedPrison.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ClosedPrison(int totalPrisoners) {
        super(totalPrisoners);
        myLog.logger.log(Level.INFO, "Объект ClosedPrison создан с {0} заключёнными.", totalPrisoners);
        myLog.logger.log(Level.WARNING, "Предупреждение: Объект ClosedPrison создан.");
        myLog.logger.log(Level.SEVERE, "Критическая ошибка: Дублирование создания объекта ClosedPrison.");
    }

    @Override
    public void exerciseYard() {
        myLog.logger.log(Level.INFO, "Доступ к спортивной площадке.");
        System.out.println("Время на спортивной площадке строго контролируется.");
    }
}
