package it.sevenbits.packages.array;

/**
 * Interface
 * @param <T>
 */
public interface IArray<T> {

    /**
     * setter
     * @param array
     */
    void setArray(final T[] array);

    /**
     * getter
     * @return array
     */
    T[] getArray();
}
