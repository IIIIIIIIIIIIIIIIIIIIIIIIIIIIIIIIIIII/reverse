package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.array.container.IArrayContainer;
import it.sevenbits.packages.array.container.implementation.ArrayContainer;
import it.sevenbits.packages.array.container.implementation.ArrayContainerException;
import it.sevenbits.packages.array.printer.implementation.OutputArray;
import it.sevenbits.packages.array.printer.implementation.OutputArrayException;
import it.sevenbits.packages.array.reverser.implementation.ReverseArrayException;
import it.sevenbits.packages.array.reverser.implementation.ReverseArray;

/**
 * Bootstrap class
 */
public final class Bootstrap {
    /**
     * Default constructor
     */
    private Bootstrap() {
    }

    private static String[] ARRAY = new String[]{"one", "two", "three", "four", "five", "s"};
    private static Integer[] MASS = new Integer[]{1, 2, 3, 4, 5, 6, 7};
    private static String[] NULL = null;

    /**
     * main
     * @param args just like that
     * @throws ReverseArrayException will never be thrown
     * @throws OutputArrayException throws if incoming argument will be null
     */
    public static void main(final String[] args) throws ReverseArrayException, OutputArrayException, ArrayContainerException {
        IArrayContainer<String> array = new ArrayContainer<String>(NULL);
        OutputArray printArray = new OutputArray();
        printArray.outputArray(array);
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverseArray(array);
        printArray.outputArray(array);
    }
}
