package it.sevenbits.packages.array.implementation;

import it.sevenbits.packages.array.IReverseArray;

public class ReverseArray<T> implements IReverseArray<T> {
    private T[] array;
    /**
     * Reversing of array
     */
    public void reverseArray() {
        try {
            int length = array.length;
            for (int i = 0; i < length / 2; i++) {
                T temp = this.array[i];
                array[i] = this.array[array.length - i - 1];
                this.array[array.length - i - 1] = temp;
            }
        } catch (NullPointerException ex) {
            System.out.print(ex);
        } catch (IndexOutOfBoundsException e) {
            System.out.print(e);
        }
    }

    /**
     * Reverse
     * @param newArray
     */
    public ReverseArray(final T[] newArray) {
        array = newArray;
    }
}
