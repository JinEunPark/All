package fortheTest.factoryPattern.factorypattern;

public class NYTomatoPizza extends Pizza{
    public NYTomatoPizza() {
        super.dough = "뉴욕 NYTomatoPizza 피자 얇은 도우임";
        super.sauce = "뉴욕 NYTomatoPizza  피자 소스임";
        super.name = "뉴욕 NYTomatoPizza 피자 이름임";
        super.toppings.add("뉴욕 NYTomatoPizza 피자 추가 토핑입니당~~");
    }
}
