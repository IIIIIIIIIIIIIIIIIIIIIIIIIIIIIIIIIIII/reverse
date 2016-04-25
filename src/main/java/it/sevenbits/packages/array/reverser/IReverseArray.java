package it.sevenbits.packages.array.reverser;

import it.sevenbits.packages.array.container.IArrayContainer;
import it.sevenbits.packages.array.container.implementation.ArrayContainerException;
import it.sevenbits.packages.array.reverser.implementation.ReverseArrayException;

/**
 * Interface of ReverseArray class
 */
public interface IReverseArray {
    /**
     * reverse array
     * @param array is element of ArrayContainer class
     * @param <T> type
     * @throws ReverseArrayException my own exception
     * @throws ArrayContainerException
     */
    <T> void reverseArray(IArrayContainer<T> array) throws ReverseArrayException, ArrayContainerException;
}
