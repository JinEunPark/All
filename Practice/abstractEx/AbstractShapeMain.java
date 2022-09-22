package abstractEx;

public class AbstractShapeMain {
    public static void main(String[]args){
        Shape r = new Rectangle(20.0,10.0);//shape이라는 abstaract class를 상속했기 때문에 자동으로 upcasting 됨
        Shape c = new Circle(10);
        System.out.printf("사각형의 면적: %.2f\n", r.calcArea());
        System.out.printf("원의 둘래: %.2f\n", c.calcPerimeter());//소수점 밑에 두자리 출력하는거 까먹지 말아용

    }
}
