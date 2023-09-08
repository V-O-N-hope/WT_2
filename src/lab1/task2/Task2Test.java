package lab1.task2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Task2Test {


    //in center
    @Test
    public void test1() {
        double x, y = x = 0;
        boolean res = Logic.isIn(x, y);
        assertTrue("Failed", res);
    }

    //check left x border
    @Test
    public void test2() {
        double x = -4;
        double y = 0.1;

        boolean res = Logic.isIn(x, y);

        assertTrue("Failed", res);
    }


    //check near the border, but outside
    @Test
    public void test3() {
        double x = -6;
        double y = -3.1;

        boolean res = !Logic.isIn(x, y);

        assertTrue("Failed", res);
    }

    @Test
    public void test4() {
        double x = -6;
        double y = -3;

        boolean res = Logic.isIn(x, y);

        assertTrue("Failed", res);
    }


    //check
    @Test
    public void test5() {
        double x = -6;
        double y = 0;

        boolean res = Logic.isIn(x, y);

        assertTrue("Failed", res);
    }


    //check y border (up)
    @Test
    public void test6() {
        double x = 0;
        double y = 6;

        boolean res = !Logic.isIn(x, y);

        assertTrue("Failed", res);
    }
}
