package lab1.task10;

public class Logic {

    public static double calcWeight(Bucket bucket){
        double weight = 0;

        for (Ball ball : bucket.balls) {
            if (ball.getColor() == Colors.blue) {
                weight += ball.getWeight();
            }
        }

        return weight;
    }
}
