package it.sevenbits.packages.array.implementation;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.array.IReverseArray;

/**
 * class of reversing of array
 */
public class ReverseArray implements IReverseArray {
    /**
     *
     * @param array is element of Array
     * @param <T> type
     */
    public <T> void reverseArray(final IArray<T> array) {
        T[] tempArray = array.getArray();
        for (int i = 0; i < tempArray.length / 2; i++) {
            T currentElement = tempArray[i];
            tempArray[i] = tempArray[tempArray.length - i - 1];
            tempArray[tempArray.length - i - 1] = currentElement;
        }
        array.setArray(tempArray);
    }
}
