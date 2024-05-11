package org.example;

public class OpenPrison extends Prison {
    public OpenPrison(int totalPrisoners) {
        super(totalPrisoners);
    }

    @Override
    public void lockdown() {
        System.out.println("В открытой тюрьме нет полной изоляции.");
    }

    @Override
    public void solitaryConfinement() {
        System.out.println("В открытой тюрьме нет одиночных камер.");
    }
}
