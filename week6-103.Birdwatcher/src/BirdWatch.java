import java.util.*;

public class BirdWatch {                       // finish implementing Bird to this class.
    private ArrayList<Bird> birds;

    public BirdWatch(Scanner input) {
        birds = new ArrayList<Bird>();
    }

    public void Add(Scanner input) {


        System.out.print("Name: ");
        String commonName = input.nextLine();
        // code no longer needed: this.birds().get(Names().add(commonName);

        System.out.print("Latin Name: ");
        String latinName = input.nextLine();
        // code no longer needed: this.latinNames().add(latinName);

        birds.add(new Bird(commonName, latinName));   // creates new Bird object and att it to ArrayList birds of Bird objects.
    }

    public void Observation(Scanner input) {
        System.out.print("What was observed:? ");
        String name = input.nextLine();
        int searchNumber = this.search(name);   // this.search(name) returns a number, either the index location of name, or -1 if name is not within this.birdNames

        if (searchNumber >= 0) {
            this.birds.get(searchNumber).addObserved();     // addObserved() method of Bird object, at index location searchNumber, run from ArrayList birds
        } else {
            System.out.println("This is not a bird!");
        }
    }


    public int search(String name) {           // returns the index location of name, in this.birds ArrayList. If name is not there, returns -1

        if (this.birds.size()==0) {
            return -1;
        } else {
            for (int count = 0; count <= this.birds.size(); count++) {

                String thisBird = this.birds.get(count).returnName();    // birdName is now the same as the commonName of the Bird object at index "count"

                if (this.wordMatch(name, thisBird)) {            // What this does: if passed String parameter name matches thisBird String, an object instance of Bird object in birds ArrayList at index "count", return integer number of current index
                    return count;
                } else {
                    System.out.println("This is not a bird!");
                }
            }
        }
        return -1;

    }

    public static boolean wordMatch(String word, String searched) {
        if (word == null || searched == null || word.isEmpty() || searched.isEmpty()) {
            return false;
        }

        word = word.trim();
        word = word.toUpperCase();
        searched = searched.trim();
        searched = searched.toUpperCase();

        if (word.contains(searched)) {
            return true;
        } else {
            return false;
        }
    }

    public void Show(Scanner input) {         // last thing changed on this exercse...
        System.out.println("What?");
        String whichBird = input.nextLine();

        if (this.search(whichBird) >= 0) {   // make sure the bird really exists.
            int atIndex = this.search(whichBird);    // get index number of this bird name
            this.printBird(atIndex);           // and print it
        } else {
            System.out.println("This is not a bird!");
        }

    }

    public void Statistics() {
        for (int count = 0; count < birds.size(); count++) {     // for each Bird object in ArrayList birds()....
            this.printBird(count);     // printBird at index "count"
            System.out.println("");
        }
    }

    public void printBird(int count) {
        System.out.print(this.birds.get(count).returnName());     // print commonName
        System.out.print(" (" + this.birds.get(count).returnLatin() + "): ");    // print latinName
        System.out.print(this.birds.get(count).returnObserved() + " observations");     // print # of observations
    }
}