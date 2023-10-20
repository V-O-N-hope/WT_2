package lab1.task10;

public class Main {

    public static void main(String[] args) {

        Bucket bucket = new Bucket(Input.balls1);

        double weight = Logic.calcWeight(bucket);

        System.out.printf("The weight is %4.1f", weight);
    }
}
