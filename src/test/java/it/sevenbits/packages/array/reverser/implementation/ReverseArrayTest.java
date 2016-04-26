package it.sevenbits.packages.array.reverser.implementation;

import it.sevenbits.packages.array.container.IArrayContainer;
import it.sevenbits.packages.array.container.implementation.ArrayContainer;
import it.sevenbits.packages.array.reverser.IReverseArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseArrayTest {

    @Test
    public void reverseOddNumberOfElementsTest() throws ReverseArrayException {
        Integer[] array = new Integer[] {5, 9, 10, 11, 12};
        Integer[] invertedArray = new Integer[] {12, 11, 10, 9, 5};
        IArrayContainer<Integer> container = new ArrayContainer<Integer>(array);
        IReverseArray invertArray = new ReverseArray();
        invertArray.reverseArray(container);
        assertEquals("Method reverseArray does not work correctly with odd number of elements", invertedArray, array);
    }

    @Test
    public void reverseEvenNumberOfElementsTest() throws ReverseArrayException {
        String[] array = new String[] {"one", "two", "three", "four", "five", "six"};
        String[] invertedArray = new String[] {"six", "five", "four", "three", "two", "one"};
        IArrayContainer<String> container = new ArrayContainer<String>(array);
        IReverseArray invertArray = new ReverseArray();
        invertArray.reverseArray(container);
        assertEquals("Method reverseArray does not work correctly with even number of elements", invertedArray, array);
    }

    @Test
    public void reverseOneElementTest() throws ReverseArrayException {
        Double[] array = new Double[] {-3.23595};
        IArrayContainer<Double> container = new ArrayContainer<Double>(array);
        IReverseArray invertArray = new ReverseArray();
        invertArray.reverseArray(container);
        assertEquals("Method reverseArray does not work correctly with one element", new Double[] {-3.23595}, array);
    }

    @Test
    public void reverseEmptyArrayTest() throws ReverseArrayException {
        Double[] array = new Double[0];
        IArrayContainer<Double> container = new ArrayContainer<Double>(array);
        IReverseArray invertArray = new ReverseArray();
        invertArray.reverseArray(container);
        assertEquals("Method reverseArray does not work correctly with empty array", new Double[] {}, array);
    }
    @Test(expected = ReverseArrayException.class)
    public void reverseExceptionTest() throws ReverseArrayException {
        String[] array = null;
        IArrayContainer<String> container = new ArrayContainer<String>(array);
        IReverseArray invertArray = new ReverseArray();
        invertArray.reverseArray(container);
    }
}
