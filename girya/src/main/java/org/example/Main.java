package org.example;

public class Main {
    public static void main(String[] args) {

        Prison prison = new Prison(30);
        prison.countPrisoners();
        prison.lockdown();
        prison.exerciseYard();
        prison.mailCall();
        prison.paroleHearing();
        prison.visitorRegistration();
        prison.contrabandCheck();
        prison.solitaryConfinement();

        System.out.println("\n");

        Prison openPrison = new OpenPrison(20);
        openPrison.countPrisoners();
        openPrison.lockdown();
        openPrison.exerciseYard();
        openPrison.mailCall();
        openPrison.paroleHearing();
        openPrison.visitorRegistration();
        openPrison.contrabandCheck();
        openPrison.solitaryConfinement();

        System.out.println("\n");

        Prison closedPrison = new ClosedPrison(50);
        closedPrison.countPrisoners();
        closedPrison.lockdown();
        closedPrison.exerciseYard();
        closedPrison.mailCall();
        closedPrison.paroleHearing();
        closedPrison.visitorRegistration();
        closedPrison.contrabandCheck();
        closedPrison.solitaryConfinement();
    }
}
