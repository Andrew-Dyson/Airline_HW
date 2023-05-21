public enum Rank {

    CABINCREW("cabin crew"),
    CAPTAIN("captain");

    private final String title;

    Rank(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

