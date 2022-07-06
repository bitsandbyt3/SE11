package de.hbrs.team89.se1_starter_repo.models;

import de.hbrs.team89.se1_starter_repo.Controller.KundenController;

public class Mitarbeiter {
    private String name;

    public Mitarbeiter(String name) {
        this.name = name;
    }


    public void NeuerUser(String name, String Bankverbindung){
    KundenController.newKunde(name,Bankverbindung);
    }


    public boolean ChangeNumberOfCars(int number, KundeIF kunde){
        return kunde.ChangeNumberOfCars(number);
    }

    public boolean AddKennzeichen(String kennzeichen, KundeIF kunde){
        return kunde.AddKennzeichen(kennzeichen);
    }

    public boolean RemoveKennzeichen(String kennzeichen, KundeIF kunde){
        return kunde.RemoveKennzeichen(kennzeichen);
    }

    public String getName() {
        return name;
    }


}
