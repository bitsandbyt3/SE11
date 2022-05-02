package de.hbrs.team89.se1_starter_repo;

public class CorporateCustomer implements CustomerIF{
    String corporateName;
    int numberOfCars;
    double invoice;
    String[] numberplates;

    public CorporateCustomer(String corporateName,int numberOfCars,double invoice, String[] numberplates) {
        this.corporateName = corporateName;
        this.numberOfCars = numberOfCars;
        this.invoice = invoice;
        this.numberplates = numberplates;
    }

    @Override
    public void setName(String newCorporateName) {
        this.corporateName = newCorporateName;
    }

    @Override
    public String getName() {
        return corporateName;
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