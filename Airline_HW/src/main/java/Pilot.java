public class Pilot extends Employee{


    private String pilotLicenceNumber;

    private Rank rank;

    public Pilot(String name, String pilotLicenceNumber, Rank rank){
        super(rank.getTitle());
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }



}
