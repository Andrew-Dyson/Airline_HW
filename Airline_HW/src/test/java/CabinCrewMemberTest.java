import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember1;


    @Before
    public void setUp(){
        cabinCrewMember1 = new CabinCrewMember("Victor", Rank.CABINCREW);
    }

    @Test
    public void crewMemberHasAName(){
        assertEquals("Victor", cabinCrewMember1.getName());
    }
    @Test
    public void crewMemberHasARank(){
        assertEquals(Rank.CABINCREW, cabinCrewMember1.getRank());
    }

}
