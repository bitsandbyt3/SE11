package de.hbrs.team89.se1_starter_repo.Entwurfsmuster;

public class Ausführer {
    private IBefehl befehl;

    public void speicherBefehl(IBefehl befehl){
        this.befehl=befehl;
    }

    public String aktivieren(){
        return befehl.fuehreAus();
    }

    //TEST
}
