package lab1.task10;

public class Ball {

    private Colors color;
    private double weight;

    public Ball() {

    }

    public Ball(Colors color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Colors getColor() {
        return this.color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
