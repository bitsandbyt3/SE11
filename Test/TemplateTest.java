import de.hbrs.team89.se1_starter_repo.models.CarIF;
import de.hbrs.team89.se1_starter_repo.models.ParkhausServlet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateTest {

    /* Aufgabe 2 verschieben der Berechnungen in ein Template
     * so sollen alle für die Statistiken benötigten Berechnungen über ein Template laufen.
     */

    @Test
    void templateSUM(){
        //Summe von zb 3 geparkten Autos die dann insgesamt 15Euro zahlen müssen
        assertEquals(15, templateArithmetics.getSum());
    }
    @Test
    void templateAVG(){
        //Durchschnittspreis der gezahlt wurde (hier wieder jeweils 3 Autos mit 15 Euro gesammt angenommen)
        assertEquals(5, templateArithmetics.getAVG());
    }

    @Test
    void templateEURO(){
        //Umrechnung der Parkzeit in Euro
        assertEquals(10, templateArithmetics.getPriceEuro());
    }

    @Test
    void templateAVGDuration(){
        //Durchschnittliche Parkdauer aller erfassten Parkvorgänge
        assertEquals(2, templateArithmetics.getAVGDuration());
    }
}
