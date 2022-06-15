package de.hbrs.team89.se1_starter_repo.Entwurfsmuster;

import de.hbrs.team89.se1_starter_repo.models.CarIF;
import de.hbrs.team89.se1_starter_repo.templates.ToEuro;

import java.util.List;

public class Calculator {
    public String sum(List<CarIF> oldCars){
        ToEuro summe = new ToEuro();
        return summe.Berechnung(oldCars);
    }

}
