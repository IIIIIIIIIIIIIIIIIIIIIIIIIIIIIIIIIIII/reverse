package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.array.implementation.Array;
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
     * main
     * @param args just like that
     */
    public static void main(final String[] args) {
        try {
            IArray<String> array = new Array<String>(ARRAY);
            OutputArray printArray = new OutputArray();
            printArray.outputArray((Array<String>) array);
            ReverseArray reverseArray = new ReverseArray();
            reverseArray.reverseArray((Array<String>) array);
            printArray.outputArray((Array<String>) array);
        } catch (NullPointerException ex) {
            System.out.print(ex);
        }
    }
}
