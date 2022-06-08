import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import de.hbrs.team89.se1_starter_repo.CustomerIF;
import de.hbrs.team89.se1_starter_repo.CorporateCustomer;
import de.hbrs.team89.se1_starter_repo.Subscriber;

import javax.swing.text.View;

public class MVPTest {
    View view;
    Controller controller;
    Model model;


    @BeforeEach
    void setUp(){
        view = new View;
        controller = new Controller;
        model = new Models;
    }
    @AfterEach
    void tearDown(){
        view = null;
        controller = null;
        model = null;
    }

    @Test
    void isControllerObject(){
        assertTrue(controller instanceof Controller);
    }

    @Test
    void isViewObject(){
        assertTrue(view instanceof View);
    }

    @Test
    void isModelObject(){
        assertTrue(model instanceof Models);
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