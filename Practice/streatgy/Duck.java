package streatgy;
//sub class들의 클래스들이 공통적으로 가져야할 요소들을 abstract class로 작성함
public abstract class Duck {

    FlyBehavior flyBehavior;//behavior를 구현한 클래스를 받을 거임
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public void setFlyBehavior(FlyBehavior flyBehavior){//for setting behavior dynamically
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("all ducks float even decoys");
    }
}
