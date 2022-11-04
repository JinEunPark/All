package algorithmAssigment.quicksort.version2;

import algorithmAssigment.Compare;
import algorithmAssigment.quicksort.Partition;

import java.util.ArrayList;
import java.util.Random;

public class SelectPivotRandomNumber extends Compare implements Partition {

    public void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    @Override
    public int selectPivot(ArrayList<Integer> list, int left, int right) {

        Random random = new Random();
        int pivot = random.nextInt(right - left +1)+left;
//        System.out.println(pivot);
        swap(list,right,pivot);

        return list.get(right);
    }
}
