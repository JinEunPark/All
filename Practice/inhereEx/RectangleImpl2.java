package inhereEx;

public class RectangleImpl2 extends Rectangle implements IShape {

    private double width;
    private double height;

    public RectangleImpl2(double width, double height) {

        super(width, height);//상속받은 클래스를 사용하기 위해서 생성자 super class의 생성자를 사용함.
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
}
