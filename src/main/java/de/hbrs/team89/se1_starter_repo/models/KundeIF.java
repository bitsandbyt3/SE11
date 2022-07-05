package de.hbrs.team89.se1_starter_repo.models;

public interface KundeIF {
    //TODO view machen und dann diese Methode
    //public view Kundeninformationenabrufen(KundeIF kunde);

    public String getName();
    public String[] getNumberPlates();
    public int getNumberOfParkingspaces();
    public int getUsedparkingSpaces() ;
    public void Platzbelegen();
    public void Platzfreimachen();
    void changeBankverbindung(String bankverbindung);
    public boolean ChangeNumberOfCars(int number);
    public boolean AddKennzeichen(String kennzeichen);
    public boolean RemoveKennzeichen(String kennzeichen);
}
