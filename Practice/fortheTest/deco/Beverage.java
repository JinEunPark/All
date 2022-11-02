package fortheTest.deco;

public abstract class Beverage {
    String description = "no title";

    public String getDescription(){
        return description;
    }
    public abstract double cost();//상속 받은 객체에서 구현해야할 메소드
}
