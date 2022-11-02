package fortheTest.streatgy;

public class ModelDuck extends Duck{
    public ModelDuck(){
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new MuteQuack();
    }

}
