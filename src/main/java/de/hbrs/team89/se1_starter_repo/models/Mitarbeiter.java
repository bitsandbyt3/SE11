package de.hbrs.team89.se1_starter_repo.models;

import de.hbrs.team89.se1_starter_repo.Controller.KundenController;

public class Mitarbeiter {
    private String name = "Mitarbeiter";
    private KundenController kundenController = new KundenController();

    public void NeuerUser(String name, String Bankverbindung){
    kundenController.newKunde(name,Bankverbindung);
    }

    public void NeuerUser(String name){
        String Bankverbindung = "Bankverbindung";
        kundenController.newKunde(name,Bankverbindung);
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
}
