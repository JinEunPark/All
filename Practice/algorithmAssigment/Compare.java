package algorithmAssigment;

import java.util.Comparator;

public class Compare {

    int COMCOUNT= 0;

    public boolean compare(int o1, int o2) {

        COMCOUNT++;

        if(o1>o2){
            return true;
        }else{
            return false;
        }
    }
}
