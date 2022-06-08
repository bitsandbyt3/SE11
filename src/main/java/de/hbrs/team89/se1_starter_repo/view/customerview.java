package de.hbrs.team89.se1_starter_repo.view;

import de.hbrs.team89.se1_starter_repo.controller.ParkhausServlet;
import de.hbrs.team89.se1_starter_repo.models.CarIF;
import de.hbrs.team89.se1_starter_repo.models.CustomerIF;

import java.util.List;

public class customerview {
    private double invoice;
    public customerview(CustomerIF customerIF) {
        this.invoice = customerIF.getInvoice();
    }

    public double getInvoice() {
        return invoice;
    }
}
