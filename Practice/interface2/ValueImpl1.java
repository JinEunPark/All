package interface2;

public class ValueImpl1 implements IValue{
    private String name;

    ValueImpl1(){
        name = "ValueImpl2";
    }

    public String getName(){
        return name;
    }

    public void setName(String s){
        name = s;
    }

}
