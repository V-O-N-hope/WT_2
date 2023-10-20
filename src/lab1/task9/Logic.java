package lab1.task9;

public class Logic {

    public static double calcWeight(Bucket bucket){
        double weight = 0;

        for (Ball ball : bucket.getBalls()) {
            if (ball.getColor() == Colors.blue) {
                weight += ball.getWeight();
            }
        }

        return weight;
    }
}
