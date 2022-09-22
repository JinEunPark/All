package interfaceEx;

public class RectangleImpl implements IShape {

    private double width;
    private double height;

    public RectangleImpl(double weight, double height){
        this.width = weight;
        this.height = height;
    }
    public double getWidth(){
        return  width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }


    @Override
    public double calcArea() {
        return width*height;
    }

    @Override
    public double calcPerimeter() {
        return (width+height)*2;
    }
}
