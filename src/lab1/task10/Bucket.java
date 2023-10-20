package lab1.task10;

import java.util.Arrays;

public class Bucket {
    public Ball[] balls;

    public Bucket(){

    }

    public Bucket(Ball[] src){
        balls = new Ball[src.length];
        System.arraycopy(src, 0, balls, 0 ,src.length);
    }

    public Ball[] getBalls(){
        return this.balls;
    }
}
