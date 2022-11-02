package fortheTest.factoryPattern.factorypattern;
//creator class의 interface
abstract class PizzaStore {//피자 가게의 인터 이스를 만들기 위해서 생성함

    public Pizza orderPizza(String type) {

        Pizza pizza = null;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.cut();
        pizza.box();
        pizza.getName();

        return pizza;
    }
    abstract Pizza createPizza(String type);
}

