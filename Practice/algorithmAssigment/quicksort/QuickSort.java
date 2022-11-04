package algorithmAssigment.quicksort;

import algorithmAssigment.Compare;
import algorithmAssigment.SortMethod;
import algorithmAssigment.quicksort.Partition;

import java.util.ArrayList;

public class QuickSort extends Compare implements SortMethod {

    Partition partition;

    //객체 의존성 주입
    public QuickSort(Partition partition) {
        this.partition = partition;
    }
    // A utility function to swap two elements

    public void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */

    public int partition(ArrayList<Integer> list, int left, int right) {

        int pivot = partition.selectPivot(list, left, right);

        int i = left - 1;

        for (int j = left; j < right; j++) {

            if (compare(pivot, list.get(j))) {
                i += 1;
                swap(list, i, j);
            }

        }

        swap(list, i + 1, right);

        return i+1;
    }

    public void quickSort(ArrayList<Integer> list, int left, int right) {
//        System.out.println(""+left+" "+right);
        if (left < right) {

            int pivot = partition(list, left, right);
            quickSort(list, left, pivot - 1);
            quickSort(list, pivot + 1, right);
        }
    }

    @Override
    public void sort(ArrayList<Integer> list) {

        quickSort(list, 0, list.size() - 1);
    }
}
