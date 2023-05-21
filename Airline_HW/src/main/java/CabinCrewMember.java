public class CabinCrewMember extends Employee{

    private Rank rank;

    public CabinCrewMember(String name, Rank rank){
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

}
