package de.hbrs.team89.se1_starter_repo.Entwurfsmuster;

import de.hbrs.team89.se1_starter_repo.models.CarIF;

import java.util.List;

public class SumBefehl implements  IBefehl{
    private Calculator calculator;
    private List<CarIF> oldCars;

    public SumBefehl(Calculator calculator,List<CarIF> cars){
        this.calculator=calculator;
        this.oldCars=cars;
    }
    @Override
    public String fuehreAus() {
        return calculator.sum(oldCars);
    }
}
