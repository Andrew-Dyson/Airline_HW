public enum PlaneType {
    EMBRAER120BRASILIA(30, 20000),
    BOEING737(150, 50000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }
}
