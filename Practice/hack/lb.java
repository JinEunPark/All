package hack;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

import java.lang.Math;

public class lb {


    class Solution {
        public int solution(int[] money) {
            int len = money.length;
            int[] money2 = Arrays.stream(money).toArray();
            int[] result = new int[len];
            int[] result2 = new int[len];

            result[0] = money[0];
            result[1] = money[0];
            money[len-1] = 0;

            result2[0] = 0;
            result2[1] = money2[1];



            for(int i = 2; i< len; i++){
                int before = result[i-1];
                int bebefore = result[i-2] + money[i];
                int before2 = result2[i-1];
                int bebefore2 = result2[i-2] + money2[i];

                if( before >= bebefore){
                    result[i] = before;
                }else{
                    result[i] = bebefore;
                }

                if( before2 >= bebefore2){
                    result2[i] = before2;
                }else{
                    result2[i] = bebefore2;
                }
            }



            return Math.max(result[len-1],result2[len-1]);
        }
    }
}
