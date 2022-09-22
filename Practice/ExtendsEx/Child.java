package ExtendsEx;

public class Child extends Parent {

    public Child(String name , int value){
        super(name);//상속관계에 있는부모 클래스도 구현해줘야함.
        this.value = value;
    }
    private int value;
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
}
