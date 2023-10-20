package lab1.task9;

import java.util.Arrays;

public class Bucket {
    private Ball[] balls;

    public Bucket(){

    }

    public Bucket(Ball[] balls){
        balls = new Ball[balls.length];
        balls = Arrays.copyOfRange(balls, 0, balls.length);
    }

    public Ball[] getBalls(){
        return this.balls;
    }
}
