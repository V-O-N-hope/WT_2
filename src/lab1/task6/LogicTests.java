package lab1.task6;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class LogicTests {

    @Test
    public void checkingResMatrixTest1() {
        int [][] res = Logic.makeMatrixFromArray(Input.a1);
        int[][] expected = {{1, 2}, {2,1} };

        boolean check = Arrays.deepToString(res).equals(Arrays.deepToString(expected));

        assertTrue("Not ok", check);
    }

    @Test
    public void checkingMatrixTest2() {
        int [][] res = Logic.makeMatrixFromArray(Input.a2);
        int[][] expected = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2} };

        boolean check = Arrays.deepToString(res).equals(Arrays.deepToString(expected));

        assertTrue("Not ok", check);
    }


    @Test
    public void checkingResMatrixTest3() {
        int [][] res = Logic.makeMatrixFromArray(Input.a3);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4}};

        boolean check = Arrays.deepToString(res).equals(Arrays.deepToString(expected));

        assertTrue("Not ok", check);
    }

    @Test
    public void checkingResNotOrderedMatrixTest1() {
        int [][] res = Logic.makeMatrixFromArray(Input.a4);
        int[][] expected = {{20, 4, 6}, {4, 6, 20}, {6, 20, 4} };

        boolean check = Arrays.deepToString(res).equals(Arrays.deepToString(expected));

        assertTrue("Not ok", check);
    }

}
