package de.hbrs.team89.se1_starter_repo.Controller;

import de.hbrs.team89.se1_starter_repo.models.Kunde;
import de.hbrs.team89.se1_starter_repo.models.KundeIF;

import java.util.ArrayList;
import java.util.List;

public class KundenController {
    private static List<KundeIF> alleKunden;
    private List<KundeIF> gesperrteKunden;

    public boolean Kennzeichenpruefen(String kennzeichen){
    return false;
    }

    public void newKunde(String name, String bankverbindung){
        KundeIF neuer = new Kunde(name, bankverbindung,this);
        alleKunden.add(neuer);
    }
    public Kunde findKunde(String name){
       while (alleKunden.listIterator().hasNext()){
           if(alleKunden.listIterator().next().getName().equals(name)){
               return (Kunde) alleKunden.listIterator().next();
           }
       }return null;
    }

    public static List<KundeIF> getAlleKunden() {
        return alleKunden;
    }
    public static ArrayList<String> getAllNames(){
        ArrayList<String> names = null;
       while (alleKunden.listIterator().hasNext()){
           names.add(alleKunden.listIterator().next().getName());
       }
       return names;
    }
}
