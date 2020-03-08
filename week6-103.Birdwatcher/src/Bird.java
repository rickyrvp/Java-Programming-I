import java.util.*;

public class Bird {                 // *** created this at end of day, change class BirdWatch to incorporate Bird objects ***
    private String commonName;
    private String latinName;
    private int observed;

    public Bird(String commonName, String latinName) {
        this.commonName = commonName;
        this.latinName = latinName;
        this.observed = 0;
    }

    public void addObserved() {          // method addObserved adds 1 to # of observations
        this.observed += 1;
    }

    public int returnObserved() {
        return this.observed;
    }

    public String returnName() {
        return this.commonName;
    }

    public String returnLatin() {
        return this.latinName;
    }


}