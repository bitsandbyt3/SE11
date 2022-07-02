package de.hbrs.team89.se1_starter_repo.Controller;

import de.hbrs.team89.se1_starter_repo.ParkhausServlet;
import de.hbrs.team89.se1_starter_repo.models.CarIF;
import de.hbrs.team89.se1_starter_repo.models.Ticket;

import java.util.List;

public class KassenController {
    private List<Ticket> alleTickets;
    private List<Ticket> aktiveTickets;
    private List<Ticket> bezahlteTickets;
    private ServletController servlletController;

    public Ticket getTicket(CarIF auto) {
        Ticket ticket = null;
    if(servlletController.checkSpace()){
        ticket =  new Ticket(auto);
        alleTickets.add(ticket);
        aktiveTickets.add(ticket);
    }
    return ticket;
    }

    public boolean Ausfahrt(Ticket ticket) {
        if(bezahlteTickets.contains(ticket)){
            bezahlteTickets.remove(ticket);
            return true;
        }
        return false;
    }
}
