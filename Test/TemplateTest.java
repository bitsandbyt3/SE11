import de.hbrs.team89.se1_starter_repo.LevelConstructorServ;
import de.hbrs.team89.se1_starter_repo.templates.Avg;
import de.hbrs.team89.se1_starter_repo.templates.ToEuro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateTest {

    LevelConstructorServ parkhaus = new LevelConstructorServ("Parkhaus",10);

    /* Aufgabe 2 verschieben der Berechnungen in ein Template
     * so sollen alle für die Statistiken benötigten Berechnungen über ein Template laufen.
     */


    @Test
    void templateSUM(){
        //Summe von zb 3 geparkten Autos die dann insgesamt 15Euro zahlen müssen
        ToEuro summe = new ToEuro();
        assertEquals(15, summe.Berechnung(parkhaus.getoldCars()));
    }

    @Test
    void templateAVG(){
        //Durchschnittspreis der gezahlt wurde (hier wieder jeweils 3 Autos mit 15 Euro gesammt angenommen)
        Avg avg = new Avg();
        assertEquals(5, avg.Berechnung(parkhaus.getoldCars()));

    }

}

