package Lab1;
import java.lang.*;
public class Ball {
    private String color;
    private int radius;

    public Ball(String c, int r){
        color = c;
        radius = r;
    }

    public Ball(String c){
        color = c;
        radius = 0;
    }

    public Ball(){
        color = "Blue";
        radius = 0;
    }

    public void setRadius(int radius) {this.radius = radius;}
    public void setColor(String color) {this.color = color;}
    public String getColor(String color) {return color;}
    public int getRadius() {return radius;}
    public String toString() {
        return "Ball is " + color + " and his radius is " + radius;
    }

}

