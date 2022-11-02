package fortheTest.deco;

public class HouseBlend extends Beverage{

    Beverage beverage;

    public HouseBlend(){
        super.description = "houseBlend ";
    }


    @Override
    public double cost() {
        return 0.89;
    }
}
