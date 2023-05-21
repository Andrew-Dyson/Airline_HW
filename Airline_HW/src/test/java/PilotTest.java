import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;

    @Before
    public void setUp() {
        pilot1 = new Pilot("Darren", "0989090", Rank.CAPTAIN);
    }

    @Test
    public void pilotHasALicence() {
        assertEquals("0989090", pilot1.getPilotLicenceNumber());
    }
}



