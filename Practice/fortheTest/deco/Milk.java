package fortheTest.deco;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {

        this.beverage = beverage;
        description = "Milk ";

    }

    Beverage beverage;

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + description;
    }
}
