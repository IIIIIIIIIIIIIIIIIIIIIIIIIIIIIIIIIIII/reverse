package it.sevenbits.packages.array.implementation;

import it.sevenbits.packages.array.IArray;

/**
 * Content that contain our array
 * @param <T>
 */
public final class Array<T> implements IArray<T> {

    private T[] array;

    /**
     * Default constructor
     */
    private Array() {
    }

    /**
     * Constructor
     * @param newArray
     */
    public Array(final T[] newArray) {
        array = newArray;
    }
    /**
     * setter
     * @param newArray
     */
    public void setArray(final T[] newArray) {
        int length = newArray.length;
        System.arraycopy(newArray, 0, array, 0, length);
    }
    /**
     * getter
     * @return array
     */
    public T[] getArray() {
        return array;
    }
}
