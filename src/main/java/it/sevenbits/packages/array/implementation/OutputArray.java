package it.sevenbits.packages.array.implementation;

import it.sevenbits.packages.array.IOutputArray;

/**
 * Class print array
 * @param <T>
 */
public final class OutputArray<T> implements IOutputArray<T> {

    private T[] array;

    /**
     * print array
     * @param newArray of <T> type
     */
    public OutputArray(final T[] newArray) {
        array = newArray;
    }
    /**
     * output array
     */
    public void outputArray() {
            for (T element : this.array) {
                System.out.print(element + " ");
            }
            System.out.println();
    }
}