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
        Integer x = 1;
        assertEquals("wrong method getValue", container.getValue(0), x);
    }

    @Test
    public void setterTest() {
        Integer x = 5;
        container.setValue(0, x);
        assertEquals("wrong method setValue", container.getValue(0), x);
    }

    @Test
    public void getterLengthTest() throws ArrayContainerException {
        Integer x = 4;
        assertEquals("wrong method getLength", container.getLength(), x);
    }
}
