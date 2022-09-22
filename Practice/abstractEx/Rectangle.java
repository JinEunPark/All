package abstractEx;

import interfaceEx.RectangleImpl;

public class Rectangle extends Shape{

    private double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width*height;
    }

    @Override
    public double calcPerimeter() {
        return 2*(width+height);
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
}
