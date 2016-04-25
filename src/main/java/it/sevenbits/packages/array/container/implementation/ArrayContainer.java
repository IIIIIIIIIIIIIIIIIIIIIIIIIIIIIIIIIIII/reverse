package it.sevenbits.packages.array.container.implementation;

import it.sevenbits.packages.array.container.IArrayContainer;

/**
 * Container for our object
 * @param <T>
 */
public final class ArrayContainer<T> implements IArrayContainer<T> {

    private T[] array;
    /**
     * Default constructor
     */
    private ArrayContainer() {
    }

    /**
     * Constructor
     * @param object is our array
     */
    public ArrayContainer(final T[] object) {
        array = object;
    }
    /**
     * set link of value in array[i]
     * @param elem of T type
     * @param i is index of current element
     */
    public void setValue(final Integer i, final T elem) {
        array[i] = elem;
    }
    /**
     * getter
     * @param i is index of obtained element
     * @return element of index i
     */
    public T getValue(final Integer i) {
        return array[i];
    }

    /**
     * Getting length of array
     * @param arr is our object
     * @return length of array
     */
    public Integer getLength(final IArrayContainer<T> arr) {
        return array.length;
    }
}
