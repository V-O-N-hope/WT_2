package lab1.task4;

import java.util.Arrays;

public class Logic {

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int amountOfPrime(int[] numbers){
        int amount = 0;
        for (int number : numbers) {
            amount += isPrime(number) ? 1 : 0;
        }

        return amount;
    }

    public static int[] numsOfPos(int[] numbers) {
        int amount = amountOfPrime(numbers);
        int[] primePositions = new int[amount];

        for (int i = 0, pos = 0; i <numbers.length; i++) {
            if (isPrime(numbers[i])){
                primePositions[pos] = i;
                pos++;
            }
        }

        return primePositions;
    }

    public static String primePositionsString(int[] positions){
        return Arrays.toString(positions);
    }
}
