package algorithmAssigment;

import java.util.ArrayList;

public class SortMethod {
    public int comCount= 0;

    public boolean compare(int o1, int o2) {

        comCount++;

        if(o1>o2){
            return true;
        }else{
            return false;
        }
    }
    public void sort(ArrayList<Integer> list){};
}

