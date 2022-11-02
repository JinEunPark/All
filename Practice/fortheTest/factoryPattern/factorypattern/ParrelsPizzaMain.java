package fortheTest.factoryPattern.factorypattern;

public class ParrelsPizzaMain {
    public static void main(String[]args){

        PizzaStore nyStore = new NYPizzaStore();//뉴욕 피자 가게임
        PizzaStore chgoStore = new ChicagoPizzaStore();//시카고 피자 가게임

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("park jin made" + pizza.getName() + "ready!!");
        Pizza pizza1 = chgoStore.orderPizza("tomato");
        System.out.println("park jin made" + pizza1.getName() + "ready!!");
    }
}
