package lastTest.CompositePattern;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItemList;

    public PancakeHouseMenu(){
        menuItemList = new ArrayList<MenuItem>();
        for(int i = 0; i<10; i++){
            addItem("팬케익"+i,"thisi is fanecake",false, i*100);
        }

    }
    public void addItem(String name, String description, boolean vegeterian, double price){
        menuItemList.add(new MenuItem(name,description,vegeterian,price));
    }

    public ArrayList<MenuItem> getMenuItemList(){
        return menuItemList;
    }


    @Override
    public Iterator<MenuItem> createIterator() {

        return menuItemList.iterator();
    }
}
