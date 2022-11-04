package algorithmAssigment.insertionsort;

import algorithmAssigment.Compare;
import algorithmAssigment.SortMethod;

import java.util.ArrayList;

public class InsertionSort extends Compare implements SortMethod {

    @Override
    public void sort(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && compare(list.get(j), key)) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j +1, key);
        }

    }
}
