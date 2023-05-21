import java.util.ArrayList;

public class Flight {

    public Pilot pilot;

    public ArrayList<CabinCrewMember> crew;

    public ArrayList<Passenger> passengers;

    public Plane plane;

    public String flightNumber;

    public String destination;

    public String departureAirport;

    public String departureTime;

    public Flight(){
        this.pilot = pilot;
        this.crew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public void addAPlane(Plane planeToAdd){
        this.plane = planeToAdd;
    }

    public Plane getPlane() {
        return plane;
    }

    public void addAPassenger(Passenger passengerToAdd){
        this.passengers.add(passengerToAdd);
    }
}

