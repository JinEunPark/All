package fortheTest.factoryPattern.factorypattern;

public class ChicagoCheesePizza extends Pizza{

    public ChicagoCheesePizza() {
        super.dough = "ChicagoCheesePizza 피자 얇은 도우임";
        super.sauce = "ChicagoCheesePizza 피자 소스임";
        super.name = "ChicagoCheesePizza 피자 이름임";
        super.toppings.add("ChicagoCheesePizza 피자 추가 토핑입니당~~");
    }
    @Override
    void cut(){
        System.out.println("네모난 모양으로 자를 것이 시카고 피자의 특성입니다 ");
    }
}
