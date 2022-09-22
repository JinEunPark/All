package ExtendsEx;

public class Parent {

    String name;//private으로 선언하면 서브 클래스도 상속을 했을 지라도 접근할수 없습

    Parent(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
