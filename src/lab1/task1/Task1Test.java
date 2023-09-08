package lab1.task1;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Task1Test {

    @Test
    public void test1(){
        double x = 0;
        double y = 0;
        double res = LogicCLass.calcRes(x ,y);
        boolean ok = Double.compare(res, 0.5) == 0;
        assertTrue("failed", ok);
    }

    @Test
    public void test2(){
        double x = 1;
        double y = 1;
        double res = LogicCLass.calcRes(x ,y);
        boolean ok = res - 1.91341 <= 0.001;
        assertTrue("failed", ok);
    }

    @Test
    public void test3(){
        double x = 100;
        double y = 0;
        double res = LogicCLass.calcRes(x ,y);
        boolean ok = res - 100.01232 <= 0.001;
        assertTrue("failed", ok);
    }
}
