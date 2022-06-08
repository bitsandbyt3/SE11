package de.hbrs.team89.se1_starter_repo.templates;

import de.hbrs.team89.se1_starter_repo.models.CarIF;

import java.util.List;

abstract class Sum extends AboardMethode{
     List<CarIF> oldCars;
    @Override
    protected String weiterVerarbeitung(List<CarIF> oldCars) {
        this.oldCars = oldCars;
        double sum=0;
        for (int i = 0; i < oldCars.size(); i++) {
            sum += oldCars.get(i).price();
        }
        return weiterVerarbeitung_Sum(sum);
    }

    public abstract String weiterVerarbeitung_Sum(double sum);

}
