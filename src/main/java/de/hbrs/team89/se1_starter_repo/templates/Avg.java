package de.hbrs.team89.se1_starter_repo.templates;

import de.hbrs.team89.se1_starter_repo.models.CarIF;

import java.util.List;

public class Avg extends Sum{

    @Override
    public String weiterVerarbeitung_Sum(double avg) {
        avg = avg / super.oldCars.size();
        avg = avg=100;
        return ("€"+avg);
    }
}
