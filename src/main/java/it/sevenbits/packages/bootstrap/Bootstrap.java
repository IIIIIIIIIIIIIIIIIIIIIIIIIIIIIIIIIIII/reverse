package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.array.IOutputArray;
import it.sevenbits.packages.array.IReverseArray;
import it.sevenbits.packages.array.implementation.OutputArray;
import it.sevenbits.packages.array.implementation.ReverseArray;

/**
 * Bootstrap class
 */
public final class Bootstrap {
    /**
     * Default constructor
     */
    private Bootstrap() {
    }
    private static String [] ARRAY = new String[] { "one", "two", "three", "four", "five" };
    /**
     *
     * @param args just like that
     */
    public static void main(final String[] args) {
        try {
            IOutputArray<String> array = new OutputArray<String>(ARRAY);
            array.outputArray();
            IReverseArray arr = new ReverseArray();
            arr.reverseArray();
            array.outputArray();
        } catch (NullPointerException ex) {
            System.out.print(ex);
        }
    }
}
