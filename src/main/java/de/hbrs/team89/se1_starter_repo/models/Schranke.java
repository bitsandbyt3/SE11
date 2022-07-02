package de.hbrs.team89.se1_starter_repo.models;

import de.hbrs.team89.se1_starter_repo.Controller.KassenController;
import de.hbrs.team89.se1_starter_repo.Controller.KundenController;

public  class Schranke {
    private KundenController kundenkontroller;
    private KassenController kassenController;
    private boolean Kennzeichenlesen(CarIF car){

        return kundenkontroller.Kennzeichenpruefen(car.getNumberplate());
    }
    private Ticket Einfahrt(CarIF auto){
        Ticket ticket =  kassenController.getTicket(auto);
        if(ticket == null){
            System.out.println("Kein Platz im Parkhaus");
        }
        return ticket;
    }
    private boolean Ausfahrt(Ticket ticket){
        if(kassenController.Ausfahrt(ticket)){
            return true;
        }
        System.out.println("Ticket nicht bezahlt oder fehlerhaft");
        return false;
    }
}
