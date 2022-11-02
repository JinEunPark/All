package fortheTest.dynamic;

import java.util.Iterator;

public class ObjectDynamicArray implements Iterable<Object> {

    private int length;//현재 obj가 들어가 있는 list의 길이
    private int capacity;//현재 배열의 최대길임.
    private Object[] data;// 모든 객체를 저장하기 위해서 사용한 배열임.

    public Iterator<Object> iterator(){
        return new ObjectDynamicArrayIterator();
    }

    public class ObjectDynamicArrayIterator implements Iterator<Object>{

        int current = 0;

        @Override
        public boolean hasNext() {
            if(current < length){
                return true;
            }else{
                return false;
            }

        }

        @Override
        public Object next() {
            Object itData = data[current];
            current++;
            return itData;
        }
    }

    public ObjectDynamicArray() {


        this.data = new Object[10];//기본으로 10개짜리 배열을 생성함
        this.length = 0;//길이를 반환해서 저장함
        this.capacity = data.length;//현재 배열의 길이를 저장함.


    }


    public int size() {//현재 배열에 있는 객체의 갯수를 반환한다.
        return length;
    }

    public boolean add(Object t) {
        if (length < capacity) {//작거나 같은것이 아니고 반드시 더 capacity보다 작아야한다.

            data[length] = t;//객첼를 배열에 삽입함
            length++;
            return true;

        } else {
            boolean expendable = reSizeArray();

            if(expendable){
                data[length] = t;
                length++;
                return true;
            }

            return false;
        }
    }

    public Object get(int index) {

        if (index >= 0 && index < length) {
            return data[index];
        } else {
            return null;
        }
    }

    private boolean reSizeArray() {

        Object[] data2 = new Object[capacity+10];//최대 길이보다 클수도 있는 것을 생각해서 아직 더해서 연산하지 않음

        if(data2 == null) {return false;}//베열이 생성되지 않는 것을 고려해서 false를 반환함

        for (int i = 0; i < length; i++) {
            data2[i] = data[i];//배열 각각의 요소를 복사해서 집어 넣는다.
        }
        capacity += 10;

        data = data2;
        return true;

    }


}
