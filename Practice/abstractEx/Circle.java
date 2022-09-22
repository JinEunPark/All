package abstractEx;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI *radius *radius;//abstract method는 반드시 구현해야함.
    }

    @Override
    public double calcPerimeter() {
        return 2*Math.PI*radius;
    }
    public double getRadius(){ return radius; }
}
