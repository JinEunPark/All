package fortheTest.factoryPattern.factorypattern;

public class ChicagoTomatoPizza extends Pizza{
    public ChicagoTomatoPizza() {
        super.dough = "ChicagoTomatoPizza 피자 얇은 도우임";
        super.sauce = "ChicagoTomatoPizza  피자 소스임";
        super.name = "ChicagoTomatoPizza 피자 이름임";
        super.toppings.add("ChicagoTomatoPizza 피자 추가 토핑입니당~~");
    }
    @Override
    void cut(){
        System.out.println("네모난 모양으로 자를 것이 시카고 피자의 특성입니다 ");
    }
}
