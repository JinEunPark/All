package inhereEx;

public class RectangleMain {
    public static void main(String[]args){
        RectangleImpl2 rectangleImpl2 = new RectangleImpl2(10,20);
        Rectangle rectangle = rectangleImpl2;
        System.out.println(rectangle.getHeight());//Rectangle class를 상속했기 때문에 구현이 가능하다.
        IShape iShape = rectangleImpl2;
        System.out.println(iShape.calcArea());//IShape 을 implement했기 때문에 자동으로 인터페이스 타입으로 변환이 존나 가능하다.
    }
}
