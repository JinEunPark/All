package algorithmAssigment.heapsort;

import algorithmAssigment.Compare;
import algorithmAssigment.SortMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class HeapSort extends SortMethod {

    private void heapify(ArrayList<Integer> list, int len, int index) {

        int largest = index;
        int leftChild = index * 2 + 1;
        int rightChild = index * 2 + 2;

        if (leftChild < len && compare(list.get(leftChild),list.get(largest))) {
            largest = leftChild;
        }

        if (rightChild < len && compare(list.get(rightChild),list.get(largest))) {
            largest = rightChild;
        }

        if (largest != index) {
            int swap = list.get(index);
            list.set(index, list.get(largest));
            list.set(largest, swap);
            heapify(list, len, largest);

        }

    }

    @Override
    public void sort(ArrayList<Integer> list) {
        int len = list.size();
        // Build heap (rearrange array)

        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(list,len,i);
        }
        // One by one extract an element from heap

        for(int i = len - 1; i>0; i--){
            // Move current root to end
            int temp = list.get(0);
            list.set(0,list.get(i));
            list.set(i,temp);
            // call max heapify on the reduced heap
            heapify(list, i, 0);
        }

    }


}
