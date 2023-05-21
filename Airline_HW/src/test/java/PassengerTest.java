import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void setUp() {
        passenger1 = new Passenger("Tom Smith");
    }

    @Test
    public void passengerHasAName(){
        assertEquals("Tom Smith", passenger1.getName());
        }




}
