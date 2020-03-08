
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        }
        return 1.0 * this.sum / this.amountOfNumbers;
    }

}
