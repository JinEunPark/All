package algorithmAssigment.quicksort;

import java.util.ArrayList;

public interface Partition {
    public int selectPivot(ArrayList<Integer> list, int left, int right);
}
