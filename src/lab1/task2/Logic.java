package lab1.task2;

public class Logic {

    final static double EPS = 0.001;

    public static boolean isIn(double x, double y) {
        boolean answer = true;

        if (Math.abs(y) - 3 >= EPS || Math.abs(x) - 6 >= EPS || x - 6 >= EPS) {
            answer = false;
        } else if (y > 0 && ((Math.abs(x) - 4 >= EPS) || (x - 4 >= EPS))) {
            answer = false;
        }

        return answer;
    }

}
