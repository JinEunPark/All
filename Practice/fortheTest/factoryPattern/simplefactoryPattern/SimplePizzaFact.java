package fortheTest.factoryPattern.simplefactoryPattern;

// store class 객체를 생성하는 따로 팩토리 객체로 분리해서 클라이언트에서  new 연산자르 사용해서 직접적으로 객체를 생성하는 일을 막음
public class SimplePizzaFact {
    public SimplePizzaFact() {

    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("시카고")) {
            pizza = new ChicagoPizza();
        } else if (type.equals("뉴욕")) {
            pizza = new NewYorkPizza();
        }
        return pizza;
    }
}
