public class Player {
    private String name;
    private int goalsAmount;

    public Player (String name) {
        this.name = name;
    }

    public Player (String name, int goalsAmount) {
        this.name = name;
        this.goalsAmount = goalsAmount;
    }

    public String getName() {
        return this.name;
    }

    public int goals() {
        return goalsAmount;
    }

    public String toString() {
        return this.name + ", goals " + this.goalsAmount;
    }
}