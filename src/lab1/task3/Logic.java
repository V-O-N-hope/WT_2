package lab1.task3;

public class Logic {

    public static int calcAmountOfSteps(double leftBorder, double rightBorder, double step) {
        int amount = 1;

        double currentValue = leftBorder;

        while (currentValue < rightBorder) {
            amount++;
            currentValue += step;
        }

        return amount;
    }

    public static double[][] creatingSimplexMatrix(double a) {
        double[][] matrix = new double[1][2];

        matrix[0][0] = a;
        matrix[0][1] = Math.tan(a);

        return matrix;
    }

    public static double[][] creatingComplexMatrix(double a, double b, double h) {
        int amount = calcAmountOfSteps(a, b, h);

        double[][] matrix = new double[amount][2];

        double value = a;

        for (int i = 0; i < amount; i++) {

            value = Math.min(value, b);
            matrix[i][0] = value;
            matrix[i][1] = Math.tan(value);
            value += h;

        }

        return matrix;
    }

    public static double[][] creatingMatrix(double a, double b, double h) {
        double[][] matrix;

        if (a == b) {
            matrix = creatingSimplexMatrix(a);
        } else {
            matrix = creatingComplexMatrix(a, b, h);
        }

        return matrix;
    }

}
