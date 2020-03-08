public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
            if (value == upperLimit) {
                value = 0;
            } else {
                value++;
            }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue < 0 || newValue > upperLimit) {
            return;
        }
        value = newValue;
    }

    // prints counter value
    @Override
    public String toString() {
        String initialZero = "0";
        if (value > 9) {
            initialZero = "";
        }
        return initialZero + value;
    }
}