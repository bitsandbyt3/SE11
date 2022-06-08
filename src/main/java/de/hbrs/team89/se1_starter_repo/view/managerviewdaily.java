package de.hbrs.team89.se1_starter_repo.view;

import de.hbrs.team89.se1_starter_repo.controller.ParkhausServlet;
import de.hbrs.team89.se1_starter_repo.models.CarIF;

import java.util.Calendar;
import java.util.List;

public class managerviewdaily {
    private final double dailyincome;
    public managerviewdaily(ParkhausServlet servlet) {
        List<CarIF>  carIFList =  servlet.getoldCars();
        dailyincome = carIFList
                .stream()
                .filter(a -> a.end() > getDay())
                .mapToDouble(CarIF::price)
                .sum();

    }
    public double getDailyincome() {
        return dailyincome;
    }
    long getDay(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        long millis = (System.currentTimeMillis() - c.getTimeInMillis());
        return millis;
    }


}
