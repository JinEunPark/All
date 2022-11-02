package fortheTest.deco;

public class Espresso extends Beverage{

    Beverage beverage;//의존성 주입을 위해서 사용

    public Espresso(){
        super.description = "Espresso ";
    }


    @Override
    public double cost() {
        return 1.99;
    }
}
