import de.hbrs.team89.se1_starter_repo.Controller.LevelConstructorServ;
import de.hbrs.team89.se1_starter_repo.Controller.ParkhausServlet;
import de.hbrs.team89.se1_starter_repo.models.*;
import de.hbrs.team89.se1_starter_repo.view.customerview;
import de.hbrs.team89.se1_starter_repo.view.managerviewdaily;
import de.hbrs.team89.se1_starter_repo.view.managerviewweekly;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MVPTest {
    customerview view;
    managerviewdaily view1;
    managerviewweekly view2;
    LevelConstructorServ controller;
    Car model;
    Subscriber customer;


    @BeforeEach
    void setUp(){
        view = new customerview();
        view1 = new managerviewdaily();
        view2 = new managerviewweekly();
        controller = new LevelConstructorServ("Level2", 15);
        model = new Car(new String[]{"1", "2", "3", "4", "5", "6"});
        customer = new Subscriber("Tom", 1, 12.50,new String[]{"D AG-1234"});
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
    void viewCustomerView(){
        // Ausgabe von Name und Rechnungsbetrag des Objektes
        assertEquals("Tom", customer.getName());
        assertEquals(12.50, customer.getInvoice());
    }

    @Test
    void viewManagerViewDaily(){
        // Ausgabe der im Objekt gespeicherten täglichen Einnahmen
        assertEquals(1, managerviewdaily.getDailyIncome());
    }

    void viewManagerViewWeekly(){
        // Ausgabe der im Objekt gespeicherten wöchentlichen Einnahmen
        assertEquals(1, managerviewweekly.getWeeklyIncome());
    }

}