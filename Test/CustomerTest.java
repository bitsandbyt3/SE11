import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import de.hbrs.team89.se1_starter_repo.CorporateCustomer;
import de.hbrs.team89.se1_starter_repo.Subscriber;

import java.util.Arrays;

public class CustomerTest {
    Subscriber subscriber;
    CorporateCustomer corporateCustomer;

    @BeforeEach
    void setUp(){
        subscriber = new Subscriber("subname",1,1, new String[]{"number"});
        corporateCustomer = new CorporateCustomer("corpname",1,1, new String[]{"number"});
    }
    @AfterEach
    void tearDown(){
        subscriber = null;
        corporateCustomer = null;
    }
    @Test
    void getMethods(){
        String test = "subname";
        String[] test2 = new String[]{"number"};
        test.equals(subscriber.getName());
        Arrays.equals(test2, subscriber.getNumberplates());
        test = "corpname";
        test.equals(corporateCustomer.getName());
        Arrays.equals(test2, corporateCustomer.getNumberplates());
    }
    @Test
    void setMethods(){
        String test = "newName";
        String[] test2 = new String[]{"newNumber"};
        subscriber.setName(test);
        subscriber.setNumberplates(test2);
        corporateCustomer.setName(test);
        corporateCustomer.setNumberplates(test2);
        test.equals(subscriber.getName());
        Arrays.equals(test2, subscriber.getNumberplates());
        test.equals(corporateCustomer.getName());
        Arrays.equals(test2, corporateCustomer.getNumberplates());
    }


}
