package algorithmAssigment.quicksort.version3;

import algorithmAssigment.Compare;
import algorithmAssigment.quicksort.Partition;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectPivotMedian extends Compare implements Partition {
    public void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    @Override
    public int selectPivot(ArrayList<Integer> list, int left, int right) {

        if (right - left >= 3) {

            int middle = (left + right) / 2;
            int pivots[] = {list.get(left), list.get(right), list.get(middle)};
            Arrays.sort(pivots);

//            System.out.printf("%d %d %d\n", list.get(left), list.get(right), list.get(middle));

            if (pivots[1] == list.get(left)) {
                swap(list, left, right);
                return list.get(right);

            } else if (pivots[1] == list.get(right)) {

                return list.get(right);

            } else {

                swap(list, middle, right);
                return list.get(right);
            }

        } else {
            return list.get(right);
        }

    }

}
