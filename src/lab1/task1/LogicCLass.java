package lab1.task1;

public class LogicCLass {

    public static double calcRes(double x, double y){
        double up = (1 + Math.sin(x + y) * Math.sin(x + y));
        double down = 2 + Math.abs(x - (2 * x) / (1 + x * x * y * y));

        return up / down + x;
    }
}
