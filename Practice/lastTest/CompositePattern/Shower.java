package lastTest.CompositePattern;

import java.util.Iterator;

public class Shower {

    Menu dinerMenu;
    Menu pancakeHouseMenu;

    public Shower(Menu dinerMenu, Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu(){
        Iterator<MenuItem> menuItemIteratorDinner= dinerMenu.createIterator();
        Iterator<MenuItem> menuItemIteratorPan = pancakeHouseMenu.createIterator();
        this.printMenu(menuItemIteratorDinner);
        this.printMenu(menuItemIteratorPan);
    }
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.name);
            System.out.println(menuItem.description);
        }
    }

}
