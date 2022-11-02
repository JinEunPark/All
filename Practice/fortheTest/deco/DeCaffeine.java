package fortheTest.deco;

public class DeCaffeine extends Beverage{
    Beverage beverage;

    public DeCaffeine(){
        super.description = "DeCaffeine ";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
