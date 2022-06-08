import de.hbrs.team89.se1_starter_repo.controller.Level2Servlet;
import de.hbrs.team89.se1_starter_repo.controller.LevelConstructorServ;
import de.hbrs.team89.se1_starter_repo.models.Car;
import de.hbrs.team89.se1_starter_repo.models.Subscriber;
import de.hbrs.team89.se1_starter_repo.view.customerview;
import de.hbrs.team89.se1_starter_repo.view.managerviewdaily;
import de.hbrs.team89.se1_starter_repo.view.managerviewweekly;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MVPTest {
    customerview view;
    managerviewdaily view1;
    managerviewweekly view2;
    LevelConstructorServ controller;
    Car model;
    Subscriber customer;
    customerview customerview;


    @BeforeEach
    void setUp(){
        controller = new LevelConstructorServ("Level2", 15);
        view1 = new managerviewdaily(controller);
        view2 = new managerviewweekly(controller);
        model = new Car(new String[]{"1", "2", "3", "4", "5", "6"});
        customer = new Subscriber("Tom", 1, 12.50,new String[]{"D AG-1234"});
        view = new customerview(customer);
    }
    @AfterEach
    void tearDown(){
        view = null;
        controller = null;
        model = null;
    }

    @Test
    void isControllerObject(){
        assertNotNull(controller);
    }

    @Test
    void isViewObject(){
        assertNotNull(view);
        assertNotNull(view1);
        assertNotNull(view2);
    }

    @Test
    void isModelObject(){
        assertNotNull(model);
    }

    @Test
    void viewCustomerView(){
        // Ausgabe von Name und Rechnungsbetrag des Objektes
        assertEquals(12.50, view.getInvoice());
    }

    @Test
    void viewManagerViewDaily(){
        // Ausgabe der im Objekt gespeicherten täglichen Einnahmen
        assertEquals(0, view1.getDailyincome());
    }

    void viewManagerViewWeekly(){
        // Ausgabe der im Objekt gespeicherten wöchentlichen Einnahmen
        assertEquals(0, view2.getWeeklyIncome());
    }

}