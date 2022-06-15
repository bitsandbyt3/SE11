package de.hbrs.team89.se1_starter_repo.view;

import de.hbrs.team89.se1_starter_repo.models.CustomerIF;

public class customerview {
    private double invoice;
    public customerview(CustomerIF customerIF) {
        this.invoice = customerIF.getInvoice();
    }

    public double getInvoice() {
        return invoice;
    }
}
