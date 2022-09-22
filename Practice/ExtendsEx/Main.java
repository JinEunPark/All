package ExtendsEx;

public class Main {
    public static void main(String[]args){
        Parent parent  = new Parent("parent");
        Child child = new Child("child", 2010);
        System.out.println(parent.getName());
        System.out.println(child.getValue());
        System.out.println(child.getName());
        Parent parent2 = child;
//        System.out.println(parent2.getValue());
        System.out.println(parent2.getName());
//        Child child1 = parent2;
    }
}
