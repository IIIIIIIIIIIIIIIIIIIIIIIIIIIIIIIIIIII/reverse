package it.sevenbits.packages.array.implementation;

import it.sevenbits.packages.array.IReverseArray;

/**
 * class of reversing of array
 * @param <T>
 */
public class ReverseArray<T> implements IReverseArray<T> {
    private T[] array;
    /**
     * Reversing of array
     */
    public void reverseArray() {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            T temp = this.array[i];
            array[i] = this.array[array.length - i - 1];
            this.array[array.length - i - 1] = temp;
        }
    }

    /**
     * Reverse
     * @param newArray of <T> type
     */
    public ReverseArray(final T[] newArray) {
        array = newArray;
    }
}
