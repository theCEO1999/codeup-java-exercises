package Shapes;

abstract public class Quadrilateral extends Shape implements Measurable{
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

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
