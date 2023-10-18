package lab1.task6;

public class Logic {

    public static int[][] makeMatrixFromArray(int[] a){
        int length = a.length;

        int[][] finalMatrix = new int [length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                finalMatrix[i][j] = a[(j + i) % length];
            }
        }

        return finalMatrix;
    }
}
