package strategy.task;

import java.util.Arrays;

public class MyArray {

    private int[] array;

    public MyArray(int capacity) {
        array = new int[capacity];
    }

    public int get(int index) {
        return array[index];
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public int length() {
        return array.length;
    }

    public void sort(SortInterface sortStrategy) {
        array = sortStrategy.sort(array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
