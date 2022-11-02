package fortheTest.streatgy;

public class MiniDuckSimulator {
    public static void main(String[]args){
        ModelDuck duck = new ModelDuck();
        duck.performFly();//같은 메소드를 사용해서 다형성을 실행함
        duck.performQuack();
        duck.setFlyBehavior(new FlyRocket());//set메소드를 사용해서 동적으로 behavior를 변경함
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        duck.performFly();// 다시 출력

    }
}
