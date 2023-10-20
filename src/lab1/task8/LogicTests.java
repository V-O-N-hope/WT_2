package lab1.task8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LogicTests {

    @Test
    public void testMergeCase1() {
        double[] expected = {0.5, 1.2, 2.0, 2.5, 3.7, 4.0, 5.0, 5.5, 6.8, 7.2};
        double[] result = Logic.mergeSortedArrays(Input.a1, Input.b1);
        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    public void testMergeCase2() {
        double[] expected = {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0};
        double[] result = Logic.mergeSortedArrays(Input.a2, Input.b2);
        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    public void testMergeCase3() {
        double[] expected = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3};
        double[] result = Logic.mergeSortedArrays(Input.a3, Input.b3);
        assertArrayEquals(expected, result, 0.0001);
    }
}
