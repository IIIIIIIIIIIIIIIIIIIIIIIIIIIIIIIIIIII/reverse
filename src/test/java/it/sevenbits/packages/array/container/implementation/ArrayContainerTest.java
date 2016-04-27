package it.sevenbits.packages.array.container.implementation;

import it.sevenbits.packages.array.container.IArrayContainer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayContainerTest {

    private Integer[] array = new Integer[] {1,2,3,4};
    private IArrayContainer<Integer> container = new ArrayContainer<Integer>(array);

    @Before
    public void setUp() {
        IArrayContainer container = new ArrayContainer();
    }

    @Test
    public void getterTest() {
        assertEquals("wrong method getValue", Integer.valueOf(1), container.getValue(0));
    }

    @Test
    public void setterTest() {
        container.setValue(0, 5);
        assertEquals("wrong method setValue", Integer.valueOf(5), container.getValue(0));
    }

    @Test
    public void getLengthTest() throws ArrayContainerException {
        assertEquals("wrong method getLength", Integer.valueOf(4), container.getLength());
    }

    @Test(expected = ArrayContainerException.class)
    public void getLengthExceptionTest() throws ArrayContainerException {
        Integer[] mass = null;
        IArrayContainer<Integer> container = new ArrayContainer<Integer>(mass);
        container.getLength();
    }
}
