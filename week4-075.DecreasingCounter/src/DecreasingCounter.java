public class DecreasingCounter {
    private int initialValue;
    private int value;  // instance variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (this.value > 0) {
            this.value--;
        }
    }

    // resets value to 0
    public void reset() {
        this.value = 0;
    }

    // returns the counter to initial value
    public void setInitial() {
        this.value = this.initialValue;
    }
}
