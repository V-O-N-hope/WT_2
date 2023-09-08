package lab1.task3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Task3Test {

    @Test
    public void amountTest1(){
        double a = 0;
        double b = 2;
        double h = 1.5;
        int amount = Logic.calcAmountOfSteps(a, b, h);

        boolean res = amount == 3;
        assertTrue("Failed", res);
    }

    @Test
    public void amountTest2(){
        double a = 0;
        double b = 0;
        double h = 1.5;
        int amount = Logic.calcAmountOfSteps(a, b, h);

        boolean res = amount == 1;
        assertTrue("Failed", res);
    }
}
