package algorithmAssigment.quicksort.vsersion4;

import algorithmAssigment.Compare;
import algorithmAssigment.quicksort.Partition;

import java.util.ArrayList;

import static java.lang.Math.abs;

public class SelectPivotMyAlgorithm extends Compare implements Partition {
    final static int INITIAL_WEIGHT = 1000000000;

    static int beforePivot = INITIAL_WEIGHT;
    //전에 사용한 pivot 과 제일 다른 pivot 을 고른다.
    public void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }


    @Override
    public int selectPivot(ArrayList<Integer> list, int left, int right) {

        if(beforePivot == INITIAL_WEIGHT){
            beforePivot = list.get(left) - list.get(right);
        }//초기에는 가장 왼쪽 값으로 설정함
        int deviatioin = 0;
        int pivotIndex = 0;

        for(int i = left; i<right; i++){

            if(compare(abs(beforePivot - list.get(i)),deviatioin)){
                deviatioin = abs(beforePivot - list.get(i));
                pivotIndex = i;

            }

        }
        swap(list,pivotIndex,right);
        return list.get(right);
    }
}
