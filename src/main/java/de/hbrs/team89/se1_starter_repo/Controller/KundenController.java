package de.hbrs.team89.se1_starter_repo.Controller;

import de.hbrs.team89.se1_starter_repo.models.Kunde;
import de.hbrs.team89.se1_starter_repo.models.KundeIF;

import java.util.List;

public class KundenController {
    private List<KundeIF> alleKunden;
    private List<KundeIF> gesperrteKunden;

    public boolean Kennzeichenpruefen(String kennzeichen){
    return false;
    }

    public void newKunde(String name, String bankverbindung){
        KundeIF neuer = new Kunde(name, bankverbindung,this);
        alleKunden.add(neuer);
    }



}
