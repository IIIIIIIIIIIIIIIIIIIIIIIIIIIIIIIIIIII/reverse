package it.sevenbits.packages.array.implementation;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.array.IOutputArray;

/**
 * Class print array
 */
public final class OutputArray implements IOutputArray {

    /**
     * output array
     * @param <T> type
     */
    public <T> void outputArray(final IArray<T> array) {
            T[] tempArray = array.getArray();
            for (T element : tempArray) {
                System.out.print(element + " ");
            }
            System.out.println();
    }
}