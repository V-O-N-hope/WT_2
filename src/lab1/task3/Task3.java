package lab1.task3;

public class Task3 {

    public static void main(String[] args) {
        double[][] matrix = Logic.creatingMatrix(0, 0, 1);
        for (double[] doubles : matrix) {
            System.out.printf("[%.2f][%.2f]\n", doubles[0], doubles[1]);
        }
    }

}
