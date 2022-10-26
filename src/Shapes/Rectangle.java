package Shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }


    public Rectangle(double length, double width){
        super(length, width);
    }


//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    protected double length;
//    protected double width;
//
//    public double getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//
//    public double getArea(){
//        return length * width;
//    }
//
//
//    public Rectangle(){}
//
//    public Rectangle(double length, double width){
//        setLength(length);
//        setWidth(width);
//    }

    ///////////////////////////////////////////////////////////////




}
