package it.sevenbits.packages.array.printer;

import it.sevenbits.packages.array.container.implementation.ArrayContainerException;
import it.sevenbits.packages.array.printer.implementation.OutputArrayException;
import it.sevenbits.packages.array.container.IArrayContainer;

/**
 * Print array
 */
public interface IOutputArray {
    /**
     * print array
     * @param array is our array
     * @param <T> type
     * @throws OutputArrayException my own exception
     */
     <T> void outputArray(IArrayContainer<T> array) throws OutputArrayException, ArrayContainerException;
}
