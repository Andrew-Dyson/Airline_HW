import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Pilot pilot1;
    Passenger passenger1;

    ArrayList<Passenger> passengers;
    CabinCrewMember cabinCrewMember1;
    ArrayList<CabinCrewMember> crew;
    Plane plane1;

    @Before
    public void setUp(){
        passenger1 = new Passenger("Tom Smith");
        cabinCrewMember1 = new CabinCrewMember("Victor", Rank.CABINCREW);
        pilot1 = new Pilot("Darren", "0989090", Rank.CAPTAIN);
        plane1 = new Plane(PlaneType.BOEING737);
        flight1 = new Flight();
    }

    @Test
    public void canAddAPlane(){
        flight1.addAPlane(plane1);
        assertEquals(plane1, flight1.getPlane());
    }
//    @Test
//    public void canReturnNumberOfAvailableSeats(){
//        flight1.addAPlane(plane1);
//        assertEquals(150, flight1.plane1.getCapacity());
//    }

    @Test
    public void canAddAPassenger(){
        flight1.addAPassenger(passenger1);
    }
}
