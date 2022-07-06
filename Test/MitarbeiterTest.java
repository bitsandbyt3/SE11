import de.hbrs.team89.se1_starter_repo.Controller.KundenController;
import de.hbrs.team89.se1_starter_repo.models.Mitarbeiter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class MitarbeiterTest {


    @Test
    void neuerUser(){
        Mitarbeiter mitarbeiter = new Mitarbeiter();
        String[] control = {"Peter","Karl"};

        for (int i = 0; control.length > i; i++){
            mitarbeiter.NeuerUser(control[i]);
        }

        Assertions.assertEquals(KundenController.getAlleKunden().size(), control.length);
    }
    @Test
    void changeNumberOffCars(){

    }
    @Test
    void addKennzeichen(){

    }
    @Test
    void removeKennzeichen(){

    }

}