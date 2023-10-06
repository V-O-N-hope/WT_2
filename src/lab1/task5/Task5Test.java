package lab1.task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task5Test {

    @Test
    public void maxLengthTest1() {
        int[] a = {1, 1, 2, 5, 6, 1, 2, 9};
        int max = Logic.calcMaxLength(a);
        assertEquals("Not ok", 9, max);
    }

    @Test
    public void maxLengthTest2() {
        int[] a = {3, 3, 3, 3};
        int max = Logic.calcMaxLength(a);
        assertEquals("Not ok", 3, max);
    }

    @Test
    public void findMinimumRemovalsTest1() {
        int removals = Logic.findMinimumRemovals(Input.a1);
        assertEquals("Not ok", 2, removals);
    }

    @Test
    public void findMinimumRemovalsTest2() {
        int removals = Logic.findMinimumRemovals(Input.a2);
        assertEquals("Not ok", 1, removals);
    }


}
