package lab1.task9;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestLogic {

    @Test
    public void testWeightCalc1() {
        Bucket bucket = new Bucket(Input.balls1);

        double weight = Logic.calcWeight(bucket);
        boolean res = Double.compare(weight, 20.0) == 0;

        assertTrue("Not ok", res);
    }

}
