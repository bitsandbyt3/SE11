package de.hbrs.team89.se1_starter_repo.Controller;

public class LevelConstructorServ extends ParkhausServlet{
    String name;
    int maxParkingLots;

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
}
