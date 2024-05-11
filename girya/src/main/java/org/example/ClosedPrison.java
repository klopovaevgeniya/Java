package org.example;

public class ClosedPrison extends Prison {
    public ClosedPrison(int totalPrisoners) {
        super(totalPrisoners);
    }

    @Override
    public void exerciseYard() {
        System.out.println("Время на спортивной площадке строго контролируется.");
    }
}
