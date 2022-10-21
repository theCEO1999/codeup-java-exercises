package Shapes;
import util.Input;

import java.sql.SQLOutput;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble("Enter the radius of the circle:"));
        System.out.printf("The area of your circle is %.2f and your circumference is %.2f%n", circle.getArea(), circle.getCircumference());
    }
}
