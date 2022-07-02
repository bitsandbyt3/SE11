package de.hbrs.team89.se1_starter_repo.models;

import de.hbrs.team89.se1_starter_repo.Controller.KundenController;

public class Kunde implements KundeIF{
    private String name;
    private String[] numberPlates;
    private int numberOfParkingspaces;
    private int usedparkingSpaces=0;
    private String bankverbindung;
    private String[] Rechnung;
    private KundenController kundenController;


    @Override
    public void Platzbelegen() {
        usedparkingSpaces ++;

    }

    @Override
    public void Platzfreimachen() {
        usedparkingSpaces --;

    }

    @Override
    public void changeBankverbindung( String bankverbindung) {
    this.bankverbindung = bankverbindung;
    }
}
