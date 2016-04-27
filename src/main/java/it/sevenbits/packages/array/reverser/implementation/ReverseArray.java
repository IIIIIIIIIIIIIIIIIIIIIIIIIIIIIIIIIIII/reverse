package it.sevenbits.packages.array.reverser.implementation;

import it.sevenbits.packages.array.container.IArrayContainer;
import it.sevenbits.packages.array.container.implementation.ArrayContainerException;
import it.sevenbits.packages.array.reverser.IReverseArray;

/**
 * class of reversing of array
 */
public class ReverseArray implements IReverseArray {
    /**
     * @param array is element of ArrayContainer
     * @param <T> type
     * @throws ReverseArrayException my own exception
     */
    public <T> void reverseArray(final IArrayContainer<T> array) throws ReverseArrayException {
        try {
            Integer length = array.getLength();
            for (int i = 0; i < length / 2; i++) {
                T currentElement = array.getValue(i);
                array.setValue(i, array.getValue(length - i - 1));
                array.setValue(length - i - 1, currentElement);
            }
        } catch (ArrayContainerException ex) {
            throw new ReverseArrayException("Incoming argument is null", ex);
        }
    }
}
