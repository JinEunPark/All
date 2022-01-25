package Function;

public class Test {

    long sum(int [] a){
        long ssum = 0;
        for(int i =0; i<a.length;i++){
            ssum += a[i];
        }
        return ssum;
    }
}
