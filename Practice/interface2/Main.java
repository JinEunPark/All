package interface2;

import com.sun.jdi.Value;

public class Main {
    public static void main(String[]args){
        ValueImpl1 valueImpl1 = new ValueImpl1();
        ValueImpl2 valueImpl2 = new ValueImpl2();
        System.out.println(valueImpl1.getName());
        System.out.println(valueImpl2.getName());
        IValue i1 = valueImpl1;//interface를 implements했으므로 자동으로 타입 변환이 일어남
        IValue i2 = valueImpl2;//위와 동일한 이유임
        System.out.println(i1.getValue());//override를 진행하지 않아서 0을 반환한다
        System.out.println(i2.getValue());//override를 진행했기 때문에 1을 반환한다.
    }
}
