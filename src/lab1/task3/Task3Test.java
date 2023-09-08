package lab1.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task3Test {

    @Test
    public void amountTest1() {
        double a = 0;
        double b = 2;
        double h = 1.5;
        int amount = Logic.calcAmountOfSteps(a, b, h);

        boolean res = amount == 3;
        assertTrue("Failed", res);
    }

    @Test
    public void amountTest2() {
        double a = 0;
        double b = 0;
        double h = 1.5;
        int amount = Logic.calcAmountOfSteps(a, b, h);

        boolean res = amount == 1;
        assertTrue("Failed", res);
    }

    @Test
    public void resTest1() {
        double a = 0;
        double b = 0;
        double h = 1.5;

        double[][] matrix = Logic.creatingMatrix(a, b, h);

        StringBuilder sb = new StringBuilder();
        for (double[] doubles : matrix) {
            sb.append(String.format("[%.2f][%.2f]", doubles[0], doubles[1]));
        }

        assertEquals("Failed", "[0,00][0,00]", sb.toString());
    }

    @Test
    public void resTest2() {
        double a = 0;
        double b = 4;
        double h = 1;

        double[][] matrix = Logic.creatingMatrix(a, b, h);

        StringBuilder sb = new StringBuilder();
        for (double[] doubles : matrix) {
            sb.append(String.format("[%.2f][%.2f]", doubles[0], doubles[1]));
        }
        String temp = sb.toString();
        String second = "[0,00][0,00][1,00][1,56][2,00][-2,19][3,00][-0,14][4,00][1,16]";

        assertEquals("Failed", temp, second);
    }
}
