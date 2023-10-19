package lab1.task7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;
public class LogicTests {

    @Test
    public void sortCheck1(){
        double[] dest = new double[Input.a1.length];
        double[] expected = {-7.2, 1.0,5.6,  10.0};

        System.arraycopy(Input.a1, 0, dest, 0, dest.length);
        Logic.bubbleSort(dest);

        boolean check = Arrays.equals(dest, expected) && !Arrays.equals(expected, Input.a1);

        assertTrue("Not proceed", check);
    }
}
