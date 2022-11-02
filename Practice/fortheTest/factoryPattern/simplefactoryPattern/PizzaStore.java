package fortheTest.factoryPattern.simplefactoryPattern;

//creator 를 구현하기 한것이다 여기거 직접 pizza class를 구현하지 않고 factory class로 모두 위임해서 사용했기 때문에 new생성자가 보이지 않는다.
public class PizzaStore {

    SimplePizzaFact simplePizzaFact;

    public PizzaStore(SimplePizzaFact simplePizzaFact) {
        this.simplePizzaFact = simplePizzaFact;
    }

    public Pizza orderPizza(String type) {

        Pizza pizza = null;
        pizza = simplePizzaFact.createPizza(type);

        pizza.prepare();
        pizza.cut();
        pizza.box();
        pizza.getName();

        return pizza;
    }

}
