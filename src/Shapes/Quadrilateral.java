package Shapes;

abstract public class Quadrilateral extends Shape implements Measurable{
    public double getLength() {
        return length;
    }

    public abstract void setLength(double length);

    public double getWidth() {
        return width;
    }

    public abstract void setWidth(double width);

    protected double length;
    protected double width;
    public double getPerimeter(){
        return 2*length+2*width;
    }
    public double getArea(){
        return length * width;
    }

    public Quadrilateral(double length,double width){
        this.length = length;
        this.width = width;
    }



}
