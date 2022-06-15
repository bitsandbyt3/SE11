import de.hbrs.team89.se1_starter_repo.LevelConstructorServ;
import de.hbrs.team89.se1_starter_repo.models.Car;
import de.hbrs.team89.se1_starter_repo.models.CarIF;
import de.hbrs.team89.se1_starter_repo.templates.Avg;
import de.hbrs.team89.se1_starter_repo.templates.ToEuro;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.currentTimeMillis;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandPetternTest {

    LevelConstructorServ parkhaus = new LevelConstructorServ("Parkhaus",10);

    /* Aufgabe 2 verschieben der Berechnungen in ein Template
     * so sollen alle für die Statistiken benötigten Berechnungen über ein Template laufen.
     */


    @Test
    void sum(){
        String[] params1 = {"0","0","","0","10000","10.25",""};
        String[] params2 = {"0","0","","0","10000","15.25",""};
        String[] params3 = {"0","0","","0","10000","5143.354",""};
        String[] params4 = {"0","0","","0","10000","6542.21",""};

        List<CarIF> aktuelleLieste = new ArrayList<CarIF>();

        CarIF newCar1 = new Car(params1);
        CarIF newCar2 = new Car(params1);
        CarIF newCar3 = new Car(params1);
        CarIF newCar4 = new Car(params1);

        aktuelleLieste.add(newCar1);
        aktuelleLieste.add(newCar2);
        aktuelleLieste.add(newCar3);


        assertEquals(parkhaus.oldSum(),parkhaus.sum(),"summe 1");
        parkhaus.addOldCar(newCar4);
        parkhaus.addOldCar(newCar4);
        parkhaus.addOldCar(newCar2);
        parkhaus.addOldCar(newCar4);
        parkhaus.addOldCar(newCar4);
        parkhaus.addOldCar(newCar4);
        parkhaus.addOldCar(newCar3);
        assertEquals(parkhaus.oldSum(),parkhaus.sum(),"summe 2");
    }


}


