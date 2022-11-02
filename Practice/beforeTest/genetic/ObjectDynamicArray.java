package beforeTest.genetic;

import java.util.Arrays;
import java.util.Iterator;

public class ObjectDynamicArray implements Iterable<Object> {


    Object[] array;
    int length;
    int capacity;

    @Override
    public Iterator<Object> iterator() {
        return new OBDIter();
    }

    public class OBDIter implements Iterator<Object>{
        int current = 0;

        @Override
        public boolean hasNext() {
            if(current < length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            Object iterObj = array[current];
            current++;
            return iterObj;
        }
    }

    public ObjectDynamicArray() {
        this.length = 0;
        this.capacity = 10;
        this.array = new Object[10];

    }

    private boolean isEmpty() {
        if (length == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean resizeArray() {

        Object newArray[] = new Object[array.length + 10];

        for(int i = 0; i< array.length; i++){
            newArray[i] = array[i];
        }

        array = newArray;
        capacity += 10;

        return true;
    }

    public Object get(int index) {

        if (index >= 0 && index < length) {
            return array[index];
        } else {
            return null;
        }

    }

    public boolean add(Object object) {

        if (length >= array.length) {
            boolean su = resizeArray();
            if (su == false) {
                return false;
            }
        }
        array[length] = object;
        length++;

        return true;
    }

}
