package de.hbrs.team89.se1_starter_repo.models;

import java.util.Objects;

public class Kunde implements KundeIF{

    private String name;
    private String[] numberPlates;
    private int numberOfParkingspaces;
    private int usedparkingSpaces=0;
    private String bankverbindung;
    private String[] Rechnung;

    public Kunde(String name,String bankverbindung){
        this.name = name;
        numberPlates = new String[0];
        this.bankverbindung = bankverbindung;
        Rechnung = new String[0];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String[] getNumberPlates() {
        return numberPlates;
    }

    @Override
    public int getNumberOfParkingspaces() {
        return numberOfParkingspaces;
    }

    @Override
    public int getUsedparkingSpaces() {
        return usedparkingSpaces;
    }

    @Override
    public void Platzbelegen() {
        usedparkingSpaces ++;

    }

    @Override
    public void Platzfreimachen() {
        usedparkingSpaces --;

    }

    @Override
    public void changeBankverbindung( String bankverbindung) {
    this.bankverbindung = bankverbindung;
    }

    @Override
    public boolean ChangeNumberOfCars(int number) {
        if(usedparkingSpaces <= number){
            NewArraywithSice(number);
            numberOfParkingspaces = number;
            return true;
        }
        return false;
    }

    @Override
    public boolean AddKennzeichen(String kennzeichen) {
        int result = hasFreeSpaces();
        if(result != -1){
            numberPlates[result] = kennzeichen;
            return true;
        }
        return false;
    }

    @Override
    public boolean RemoveKennzeichen(String kennzeichen) {
        int ergebnis = FindKennzeichen(kennzeichen);
        if(ergebnis != -1){
            numberPlates[ergebnis] = null;
            return true;
        }
        return false;
    }

    private void NewArraywithSice(int sice){
        String[] neu = new String[sice];
        for(int i=0;i<numberOfParkingspaces;i++){
             neu[i] = numberPlates[i];
        }
        numberPlates = neu;
    }

    private int hasFreeSpaces(){
        for(int i=0;i<numberPlates.length;i++){
            if(numberPlates[i]==null){
                return i;
            }
        }
        return -1;
    }

    private int FindKennzeichen(String kennzeichen){
        for(int i=0;i<numberPlates.length;i++){
            if(Objects.equals(numberPlates[i], kennzeichen)){
                return i;
            }
        }
        return -1;
    }

    public String[] getRechnung() {
        return Rechnung;
    }
}
