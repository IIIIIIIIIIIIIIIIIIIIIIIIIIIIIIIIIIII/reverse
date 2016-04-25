package it.sevenbits.packages.array.container.implementation;

import it.sevenbits.packages.array.container.IArrayContainer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ArrayContainerTest {

    private Integer[] array = new Integer[] {1,2,3,4};
    private IArrayContainer<Integer> container = new ArrayContainer<Integer>(array);


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
    public void getterLengthTest() {
        Integer x = 4;
        assertEquals("wrong method getLength", container.getLength(), x);
    }
}
