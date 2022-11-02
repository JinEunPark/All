package fortheTest.deco;

public abstract class CondimentDecorator extends Beverage{//fortheTest.deco pattern을 사용하기 위해서 Beverage pattern 을 구현함

    Beverage beverage;//Di 방식으로 객체를 주입해서 사용하기 위해서 사용
    public abstract String getDescription();
}
