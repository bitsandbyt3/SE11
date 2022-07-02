package de.hbrs.team89.se1_starter_repo;

import de.hbrs.team89.se1_starter_repo.Entwurfsmuster.SumBefehl;
import de.hbrs.team89.se1_starter_repo.models.CarIF;

import java.util.List;

public class LevelConstructorServ extends ParkhausServlet{
    String name;
    int maxParkingLots;
    public List<CarIF> ownCars;


    @Override
    String NAME(){
        return this.name;
    }

    @Override
    int MAX(){ // maximum number of parking slots on level 1
        return this.maxParkingLots;
    }

    @Override
    String config(){
        return ""; // use default config
        // Config Format is "Max, open_from, open_to, delay, simulation_speed"
        // e.g. return this.MAX() + ",5,23,100,10";  // TODO replace by your own parameters
    }

    public LevelConstructorServ(String name, int parkingSpaces) {
        this.name = name;
        this.maxParkingLots = parkingSpaces;
    }

    public String sum(){
        IBefehl summe = new SumBefehl(super.calculator,oldCars());
        executer.speicherBefehl(summe);
        return executer.aktivieren();
    }

    public void addOldCar(CarIF car){
        ownCars.add(car);
    }
    public String oldSum(){
        if (oldCars().size() == 0) {
            return "noch keine Autos in der Garage";

        }
        //berechnen der summe
        double sum = 0;
        for (int i = 0; i < oldCars().size(); i++) {
            sum += oldCars().get(i).price();
        }
        //umrechnen in euro
        sum = sum / 100;
        return ("€ " + sum);
    }

    public void setownCars(List<CarIF> newCars){
        ownCars = newCars;
    }
}
