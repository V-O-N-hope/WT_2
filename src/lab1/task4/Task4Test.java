package lab1.task4;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Task4Test {

    @Test
    public void primeTest1(){
        int value = 113;
        assertTrue("Failed", Logic.isPrime(value));
    }

    @Test
    public void primeTest2(){
        int value = 991;
        assertTrue("Failed", Logic.isPrime(value));
    }

    @Test
    public void resTest1(){
        int[] values = new int[] {1, 2, 5, 9, 10, 13};
        String procAnswer = Logic.primePositionsString(Logic.numsOfPos(values));
        String myAnswer = "[1, 2, 5]";
        boolean ok = procAnswer.equals(myAnswer);
        assertTrue("Failed", ok);
    }
}
