package lastTest.CompositePattern;

import java.util.Iterator;
import java.util.function.Consumer;

public class DinnerItemIterator implements Iterator<MenuItem> {

    MenuItem[] menuItems;
    int position;

    public DinnerItemIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
        this.position = 0;

    }


    @Override
    public boolean hasNext() {
        if(position < menuItems.length){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem m = menuItems[position];
        position ++;

        return m;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(" 메뉴 항목은 지워서는 안됨니다");
    }

    @Override
    public void forEachRemaining(Consumer<? super MenuItem> action) {
        throw new RuntimeException();
    }
}
