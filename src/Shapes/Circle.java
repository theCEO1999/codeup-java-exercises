package Shapes;
import util.Input;

public class Circle {

    private double radius;

    public void getRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    public Circle(double radius){

    }
}
