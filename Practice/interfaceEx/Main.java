package interfaceEx;

public class Main {
    public static void main(String[]args){
        RectangleImpl rectangle = new RectangleImpl(1,2);
        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());
    }
}
