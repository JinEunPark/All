package fortheTest.factoryPattern.factorypattern;

public class ChicagoPizzaStore extends PizzaStore{

    //factory method 객체 생성을 서브클래스에 캡슐화해 클라이언트 코드와 서브 클래스에 있는 객체 생성 코드를 분리함

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicagoCheesePizza();
        }else if(type.equals("tomato")){
            pizza = new ChicagoTomatoPizza();
        }
        return pizza;
    }
}
