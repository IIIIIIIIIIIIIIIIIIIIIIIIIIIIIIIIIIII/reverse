package it.sevenbits.packages.array.printer.implementation;

import it.sevenbits.packages.array.container.IArrayContainer;
import it.sevenbits.packages.array.container.implementation.ArrayContainerException;
import it.sevenbits.packages.array.printer.IOutputArray;

/**
 * Class print array
 */
public final class OutputArray implements IOutputArray {

    /**
     * print method
     * @param <T> type
     * @param array is our object
     * @throws OutputArrayException
     */
    public <T> void outputArray(final IArrayContainer<T> array) throws OutputArrayException {
        try {
            Integer length = array.getLength();
            for (int i = 0; i < length; i++) {
                System.out.print(array.getValue(i) + " ");
            }
            System.out.println();
        } catch (ArrayContainerException ex) {
            throw new OutputArrayException("Incoming argument is null", ex);
        } catch (NullPointerException ex) {
            throw new OutputArrayException("Incoming argument is null.", ex);
        }
    }
}