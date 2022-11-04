package databaseAccessPattern;

public class Person {
    private static int counter = 1;
    private int id;
    private String name;
    private String address;
    Person(String name, String address){
        this.name = name;
        this.address = address;
        id = counter;
        counter++;
    }
    Person(int id, String name, String address){
        this.name = name;
        this.address = address;
        this.id = id;
    }
    public String toString(){
        return ""+id+", "+name+", "+address;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

}
