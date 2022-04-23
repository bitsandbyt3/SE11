package de.hbrs.team89.se1_starter_repo;

import java.util.Arrays;

// ToDo replace 0 by correct values read from this.params
public class Car implements CarIF {
    String[] params;
    public Car( String[] params ){
        this.params = params;
    }

    @Override
    public int nr() {
        return Integer.parseInt(params[0]);
    }

    @Override
    public long begin() {
        return Long.parseLong(params[1]);
    }

    @Override
    public long end() {
        return Long.parseLong(params[3]);
    }

    @Override
    public int duration() {
        return Integer.parseInt(params[4]);
    }

    @Override
    public int price() {
        return Integer.parseInt(params[5]);
    }

    @Override
    public void setPrice(int price) {
        params[5] = String.valueOf(price);
    }

    @Override
    public void setDuration(int duration) {
        params[4] = String.valueOf(duration);
    }

    @Override
    public String toString(){
        return Arrays.toString( params );
    }
}
