package algorithmAssigment.mergesort;

import algorithmAssigment.Compare;
import algorithmAssigment.SortMethod;

import java.util.ArrayList;

public class MergeSort extends SortMethod {

    public MergeSort(){
        super();
    }

     void merge(ArrayList<Integer> list, int leftIndex, int middleIndex, int rightIndex) {
        int leftListSize = middleIndex - leftIndex + 1;
        int rightListSize = rightIndex - middleIndex;

        ArrayList<Integer> leftList = new ArrayList<>(leftListSize);
        ArrayList<Integer> rightList = new ArrayList<>(rightListSize);

        for (int i = 0; i < leftListSize; i++) {
            leftList.add(list.get(leftIndex + i));
        }

        for (int j = 0; j < rightListSize; j++) {
            rightList.add(list.get(middleIndex + 1 + j));
        }


        int i = 0, j = 0;
        int newIndex = leftIndex;

        while (i < leftListSize && j < rightListSize) {

            if (compare(leftList.get(i), rightList.get(j))) {
                list.set(newIndex, rightList.get(j));
                j++;

            } else {

                list.set(newIndex, leftList.get(i));
                i++;
            }
            newIndex++;
        }

        while (i < leftListSize) {
            list.set(newIndex, leftList.get(i));
            i++;
            newIndex++;
        }

        while (j < rightListSize) {
            list.set(newIndex, rightList.get(j));
            j++;
            newIndex++;
        }

    }

    void mergeSort(ArrayList<Integer> list, int left, int right) {
        if (left < right && (right - left) >= 1) {

            int middle = (left + right) / 2;

            mergeSort(list, left, middle);
            mergeSort(list, middle + 1, right);

            merge(list, left, middle, right);
        }
    }

    @Override
    public void sort(ArrayList<Integer> list) {
        mergeSort(list, 0, list.size() - 1);
    }
}
