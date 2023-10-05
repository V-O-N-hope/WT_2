package lab1.task5;

public class Logic {

    public static int[] calcRangeArray(int[] a){
        int n = a.length;
        int[] dp = new int[n]; // Массив для хранения длин наибольших возрастающих подпоследовательностей.

        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Начальное значение для каждого элемента - 1.
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        return dp;
    }

    public static int calcMaxLength(int[] a){

        int maxLength = 0;

        for (int j : a) {
            if (j > maxLength) {
                maxLength = j;
            }
        }

        return maxLength;
    }


    public static int findMinimumRemovals(int[] a) {
        int n = a.length;

        if (n < 1) {
            return 0; // Если длина массива меньше или равна 1, ничего удалять не нужно.
        }

        int[] dp = calcRangeArray(a); // Массив для хранения длин наибольших возрастающих подпоследовательностей.

        int maxLength = calcMaxLength(dp); // Получение максимальной длины последовательности

        // Находим количество элементов, которые нужно удалить.
        return n - maxLength;
    }
}
