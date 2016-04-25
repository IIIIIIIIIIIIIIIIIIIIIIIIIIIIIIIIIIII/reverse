package it.sevenbits.packages.array.container;

/**
 * Interface
 * @param <T>
 */
public interface IArrayContainer<T> {

    /**
     * setter
     * @param index of element
     * @param arr is array of T type
     */
    void setValue(Integer index, T arr);

    /**
     * getter
     * @param i is index of obtained element
     * @return element array[i]
     */
    T getValue(Integer i);

    /**
     * Getting length
     * @return length
     */
    Integer getLength();
}
