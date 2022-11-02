package fortheTest.deco;

public class DarkRoast extends Beverage{

    Beverage beverage;
    public DarkRoast(){
        description = "DarkRoast ";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
