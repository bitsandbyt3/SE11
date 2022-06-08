import de.hbrs.team89.se1_starter_repo.models.*;
import de.hbrs.team89.se1_starter_repo.view.customerview;
import de.hbrs.team89.se1_starter_repo.view.managerviewdaily;
import de.hbrs.team89.se1_starter_repo.view.managerviewweekly;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.swing.text.View;

public class MVPTest {
    customerview view;
    managerviewdaily view1;
    managerviewweekly view2;
    LevelConstructorServ controller;
    Car model;


    @BeforeEach
    void setUp(){
        view = new customerview();
        view1 = new managerviewdaily();
        view2 = new managerviewweekly();
        controller = new LevelConstructorServ("Level2", 15);
        model = new Car(new String[]{"1", "2", "3", "4", "5", "6"});
    }
    @AfterEach
    void tearDown(){
        view = null;
        controller = null;
        model = null;
    }

    @Test
    void isControllerObject(){
        assertTrue(controller instanceof ParkhausServlet);
    }

    @Test
    void isViewObject(){
        assertTrue(view instanceof customerview);
        assertTrue(view1 instanceof managerviewdaily);
        assertTrue(view2 instanceof managerviewweekly);
    }

    @Test
    void isModelObject(){
        assertTrue(model instanceof Car);
    }

    @Test
    void controllerCreateCar(){

    }
    @Test
    void viewDailyIncome(){

    }

    @Test
    void viewMonthlyIncome(){

    }

    @Test
    void modelGetFreeParkingSpots(){

    }


}