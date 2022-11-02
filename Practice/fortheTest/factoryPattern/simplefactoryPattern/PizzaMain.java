package fortheTest.factoryPattern.simplefactoryPattern;

public class PizzaMain {
    public static void main(String[]args){
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFact());
        pizzaStore.orderPizza("시카고");
        pizzaStore.orderPizza("뉴욕");
    }
}
