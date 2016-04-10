package it.sevenbits.packages.array;

/**
 * Array class
 */
public class Array {
    /**
     * Reversing of array
     * @param mass input array
     * @return reversed array
     */
    public int[] reverseArray(final int[] mass) {
        for (int i = 0; i < mass.length / 2; i++) {
            int temp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = temp;
        }
        return mass;
    }
    /**
     * Output array
     * @param array that will be print
     */
    public void outputArray(final int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
