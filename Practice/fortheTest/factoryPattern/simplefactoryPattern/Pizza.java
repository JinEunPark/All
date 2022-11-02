package fortheTest.factoryPattern.simplefactoryPattern;

import java.util.ArrayList;
import java.util.List;

// 다른 피자들이 상속해서 구현할 수 있게 abstract class로 구현함
abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("준비 중: " + name);
        System.out.println("도우를 돌리는 중: " + name);
        System.out.println("소스를 뿌리는 중: " + name);
        System.out.println("토핑을 올리는 중: " + name);

        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    void box() {
        System.out.println("상자에 피자를 담기");
    }

    public String getName() {
        return name;
    }


}
