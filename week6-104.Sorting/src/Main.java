import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array) {

        int smallestSoFar = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestSoFar) {
                smallestSoFar = array[i];
            }
        }
        return smallestSoFar;
    }

    public static int indexOfTheSmallest(int[] array) {
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOfSmallest = index;

        for (int i = index; i < array.length; i++) {
            if (array[i]  < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp1 = array[index1];
        int temp2 = array[index2];
        array[index1] = temp2;
        array[index2] = temp1;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexOfSmallest);
        }
    }

}
