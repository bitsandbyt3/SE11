package de.hbrs.team89.se1_starter_repo.templates;

import de.hbrs.team89.se1_starter_repo.models.CarIF;

import java.util.List;

abstract public class AboardMethode {
    final public String Berechnung(List<CarIF> oldCars){

        if (oldCars.size() == 0) {
            return "noch keine Autos in der Garage";
        }
        return String.valueOf(weiterVerarbeitung(oldCars));
    }

    abstract protected String weiterVerarbeitung(List<CarIF> oldCars);
}
