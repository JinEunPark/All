package fortheTest.factoryPattern.factorypattern;

public class NYPizzaStore extends PizzaStore{
    //팩토리 페던에서 creator에 해당하는 코드이다.

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new NYCheesePizza();
        }else if(type.equals("tomato")){
            pizza = new NYTomatoPizza();
        }
        return pizza;
    }
}
