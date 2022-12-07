package lastTest.CompositePattern;

public class Main {
    public static void main(String[]args){
        Shower shower = new Shower(new DinerMenu(), new PancakeHouseMenu());
        shower.printMenu();

    }
}
