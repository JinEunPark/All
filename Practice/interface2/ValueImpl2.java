package interface2;

public class ValueImpl2 implements IValue{

    private String name;

    public ValueImpl2(){
        this.name = "ValueImpl2";
    }

    public String getName(){return name;}

    public void setName(String s){
        this.name = s;
    }

    @Override
    public int getValue() {//1을 반환하게 함수를 오버라이딩함.
        return 1;
    }
}
