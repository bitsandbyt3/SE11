package de.hbrs.team89.se1_starter_repo.templates;

 public  class ToEuro extends Sum{

    @Override
    public String weiterVerarbeitung_Sum(double sum) {
        sum= sum/100;
        return ("€"+sum);
    }
}
