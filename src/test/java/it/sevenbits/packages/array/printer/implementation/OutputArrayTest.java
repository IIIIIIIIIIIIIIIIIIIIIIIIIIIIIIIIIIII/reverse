package it.sevenbits.packages.array.printer.implementation;

import it.sevenbits.packages.array.container.IArrayContainer;
import it.sevenbits.packages.array.container.implementation.ArrayContainer;
import it.sevenbits.packages.array.printer.IOutputArray;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class OutputArrayTest {

    private ByteArrayOutputStream out;
    private String  getOut() {
        return out.toString();
    }
    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void printerEvenNumberTest() throws OutputArrayException {
        Integer[] array = new Integer[] {1,2,3,4};
        IArrayContainer<Integer> container = new ArrayContainer<Integer>(array);
        IOutputArray printArray = new OutputArray();
        printArray.outputArray(container);
        assertEquals("Method outputArray does not correctly work with even number of elements", "1 2 3 4 \n", getOut());
    }

    @Test
    public void printerOddNumberTest() throws OutputArrayException {
        Double[] array = new Double[] {0.756, 29.5235, -4.235253};
        IArrayContainer<Double> container = new ArrayContainer<Double>(array);
        IOutputArray printArray = new OutputArray();
        printArray.outputArray(container);
        assertEquals("Method outputArray does not work correctly with odd number of elements", "0.756 29.5235 -4.235253 \n", getOut());
    }

    @Test
    public void printerOneElementTest() throws OutputArrayException {
        String[] array = new String[] {"element"};
        IArrayContainer<String> container = new ArrayContainer<String>(array);
        IOutputArray printArray = new OutputArray();
        printArray.outputArray(container);
        assertEquals("Method outputArray does not work correctly with one element", "element \n", getOut());
    }

    @Test
    public void printerEmptyArrayTest() throws OutputArrayException{
        Integer[] array = new Integer[0];
        IArrayContainer<Integer> container = new ArrayContainer<Integer>(array);
        IOutputArray printArray = new OutputArray();
        printArray.outputArray(container);
        assertEquals("Method outputArray does not correctly work with empty array", "\n", getOut());
    }

    @Test(expected = OutputArrayException.class)
    public void printerExceptionTest() throws OutputArrayException {
        IArrayContainer<Object> container = new ArrayContainer<Object>(null);
        IOutputArray printArray = new OutputArray();
        printArray.outputArray(container);
    }
}

