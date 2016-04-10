package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.array.Array;

/**
 * Bootstrap class
 */
public final class Bootstrap {
    /**
     * Default constructor
     */
    private Bootstrap() {
    }
    private static int[] ARRAY = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    /**
     *
     * @param args just like that
     */
    public static void main(final String[] args) {
        Array array = new Array();
        System.out.print("Original array: ");
        array.outputArray(ARRAY);
        array.reverseArray(ARRAY);
        System.out.print("Reversed array: ");
        array.outputArray(ARRAY);
    }
}
