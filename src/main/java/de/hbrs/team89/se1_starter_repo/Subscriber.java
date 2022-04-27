package de.hbrs.team89.se1_starter_repo;

public class Subscriber implements CustomerIF{
    String name;
    int numberOfCars;
    double invoice;
    String[] numberplates;

    public Subscriber(String name,int numberOfCars,double invoice, String[] numberplates) {
        this.name = name;
        this.numberOfCars = numberOfCars;
        this.invoice = invoice;
        this.numberplates = numberplates;
    }

    @Override
    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setNumberplates(String[] newNumberplates) {
        this.numberplates = newNumberplates;
    }

    @Override
    public String[] getNumberplates() {
        return numberplates;
    }
}
