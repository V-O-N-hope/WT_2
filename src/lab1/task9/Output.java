package lab1.task9;

public class Output {

    public static void main(String[] args) {

        Bucket bucket = new Bucket(Input.balls1);

        double weight = Logic.calcWeight(bucket);

        System.out.printf("The weight is %4.1f", weight);
    }
}
