package lastTest.CompositePattern;

import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    public DinerMenu(){
        menuItems  = new MenuItem[MAX_ITEMS];
        for(int i = 0; i< 6; i++){
            addItem("디너"+i, "this is dinner "+1, false, i*1000,i);
        }

    }
    public void addItem(String name, String description, boolean vegan, double price, int i){
        menuItems[i] = new MenuItem(name,description,vegan,price);
    }

    public MenuItem[] getMenuItems(){
        return menuItems;
    }


    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinnerItemIterator(menuItems);
    }
}
