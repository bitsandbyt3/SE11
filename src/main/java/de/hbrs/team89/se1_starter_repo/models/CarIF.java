package de.hbrs.team89.se1_starter_repo.models;

 public interface CarIF {
    int nr();
    long begin();
    long end();
    int duration();
    int price();
    void setPrice(int price);
    void setDuration(int duration);
}
