package lab1.task8;

public class Logic {
    public static double[] mergeSortedArrays(double[] a, double[] b) {
        int m = a.length;
        int n = b.length;
        double[] result = new double[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            result[k] = a[i];
            i++;
            k++;
        }

        while (j < n) {
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }
}
