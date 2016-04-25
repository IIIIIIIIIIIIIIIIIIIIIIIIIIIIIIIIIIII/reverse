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
        IArrayContainer container1 = new ArrayContainer();
    }

    @Test
    public void getterTest() {
        Integer value = 1;
        assertEquals("wrong method getValue", container.getValue(0), value);
    }

    @Test
    public void setterTest() {
        Integer value = 5;
        container.setValue(0, value);
        assertEquals("wrong method setValue", container.getValue(0), value);
    }

    @Test
    public void getLengthTest() throws ArrayContainerException {
        Integer value = 4;
        assertEquals("wrong method getLength", container.getLength(), value);
    }

    @Test(expected = ArrayContainerException.class)
    public void getterLengthTest() throws Exception {
        Integer[] mass = null;
        IArrayContainer<Integer> container = new ArrayContainer<Integer>(mass);
        container.getLength();
    }
}
