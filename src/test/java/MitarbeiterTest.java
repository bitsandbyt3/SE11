import de.hbrs.team89.se1_starter_repo.Controller.KundenController;
import de.hbrs.team89.se1_starter_repo.models.Mitarbeiter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class MitarbeiterTest {


    @Test
    void neuerUserTest(){
        Mitarbeiter mitarbeiter = new Mitarbeiter("Hans");
        String[][] control = {{"Peter","1234"},{"Karl","1223"}};

        for (int i = 0; control.length > i; i++){
            mitarbeiter.NeuerUser(control[i][0],control[i][1]);
        }
        Assertions.assertEquals(KundenController.getAlleKunden().size(), control.length);

        for (int i = 0; control.length > i; i++){

        }

    }
    @Test
    void changeNumberOffCarsTest(){

    }
    @Test
    void addKennzeichenTest(){

    }
    @Test
    void removeKennzeichenTest(){

    }

    @Test
    void getNameTest(){
        Mitarbeiter mitarbeiter = new Mitarbeiter("Paul");
        Assertions.assertSame(mitarbeiter.getName(), "Paul");
    }

}