import de.hbrs.team89.se1_starter_repo.models.LevelConstructorServ;
import de.hbrs.team89.se1_starter_repo.models.ParkhausServlet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MVPTest {
    //View view;
    LevelConstructorServ controller;
    //Model model;


    @BeforeEach
    void setUp(){
        //view = new View;
        controller = new LevelConstructorServ("Level2", 15);
        //model = new Models;
    }
    @AfterEach
    void tearDown(){
        //view = null;
        controller = null;
        //model = null;
    }

    @Test
    void isControllerObject(){
        assertTrue(controller instanceof ParkhausServlet);
    }

    @Test
    void isViewObject(){
        //assertTrue(view instanceof View);
    }

    @Test
    void isModelObject(){
        //todo
        //assertTrue(model instanceof Models);
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