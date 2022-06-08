package de.hbrs.team89.se1_starter_repo.view;

import de.hbrs.team89.se1_starter_repo.controller.ParkhausServlet;
import de.hbrs.team89.se1_starter_repo.models.CarIF;

import java.util.Calendar;
import java.util.List;

public class managerviewweekly {
    private double weeklyincome;
    public managerviewweekly(ParkhausServlet servlet) {
        if(servlet.getoldCars() !=null){
            List<CarIF> carIFList =  servlet.getoldCars();
            weeklyincome = carIFList
                    .stream()
                    .filter(a -> a.end() > getWeek())
                    .mapToDouble(CarIF::price)
                    .sum();
        }
        else weeklyincome = 0;

    }

    public double getWeeklyIncome() {
        return 0;
    }
    long getWeek(){
        Calendar cal = initClearDayCal();
        cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
        return cal.getTimeInMillis();
    }

    private static Calendar initClearDayCal() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0); // ! clear would not reset the hour of day !
        cal.clear(Calendar.MINUTE);
        cal.clear(Calendar.SECOND);
        cal.clear(Calendar.MILLISECOND);

        return cal;
    }
}
