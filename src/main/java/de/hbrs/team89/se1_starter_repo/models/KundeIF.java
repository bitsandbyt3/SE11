package de.hbrs.team89.se1_starter_repo.models;

public interface KundeIF {
    //TODO view machen und dann diese Methode
    //public view Kundeninformationenabrufen(KundeIF kunde);
    public void Platzbelegen();
    public void Platzfreimachen();
    void changeBankverbindung(String bankverbindung);
}
