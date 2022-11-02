package fortheTest.factoryPattern.simplefactoryPattern;
//시카고 피자를 구현함
public class ChicagoPizza extends Pizza{
    public ChicagoPizza(){
        super.dough = "시카고 피자 ㅈㄴ 두꺼운 도우";
        super.sauce = "시키고 피자 소스임";
        super.name = "시카고 피자 이름임";
        super.toppings.add("시카고 피자 추가 토핑입니당~~");
    }

    @Override
    void cut(){
        System.out.println("네모난 모양으로 자를 것이 시카고 피자의 특성입니다 ");
    }
}
