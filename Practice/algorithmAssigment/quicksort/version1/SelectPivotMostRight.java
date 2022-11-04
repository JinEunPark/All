package algorithmAssigment.quicksort.version1;

import algorithmAssigment.Compare;
import algorithmAssigment.quicksort.Partition;

import java.util.ArrayList;

public class SelectPivotMostRight extends Compare implements Partition {
    public void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    @Override
    public int selectPivot(ArrayList<Integer> list, int left, int right) {

        int pivot = list.get(right);

        return pivot;
    }
}
