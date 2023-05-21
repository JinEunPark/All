package AdapterPattern;

import java.util.*;
import java.lang.Math;
class Solution {

    public static int solution(String arr[]) {

        int nlen = arr.length/2 + 1;
        int[] numbers = new int[nlen];
        String[] operator = new String[nlen-1];
        int e = 0;
        int j = 0;

        int[][] maxDp = new int[nlen][nlen];
        int[][] minDp = new int[nlen][nlen];


        for(int i = 0; i < arr.length; i++){
            if(i % 2 ==0){
                numbers[e] = Integer.parseInt(arr[i]);
                e++;
            }else{
                operator[j] = arr[i];
                j++;
            }
        }



        for(int i = 0; i < nlen;  i++){
            Arrays.fill(maxDp[i], Integer.MIN_VALUE);
            Arrays.fill(minDp[i], Integer.MAX_VALUE);
        }



        for(int step = 0; step < nlen; step++){
            for(int start = 0; start < nlen - step; start++){
                int end = start+ step;
                if(step ==0){
                    maxDp[start][start] = numbers[start];
                    minDp[start][start] = numbers[start];
                }else{
                    for(int middle = start+1; middle < end; middle++){
                        String oper;
                        if(middle == end){
                            oper = operator[end -1];
                        }else{
                            oper = operator[middle];
                        }

                        switch(oper){
                            case "+":
                                maxDp[start][end] = Math.max(maxDp[start][end], maxDp[start][middle] + maxDp[middle][end]);
                                minDp[start][end] = Math.min(minDp[start][end], minDp[start][middle] + minDp[middle][end]);
                                break;
                            case"-":
                                maxDp[start][end] = Math.max(maxDp[start][end], maxDp[start][middle] - minDp[middle][end]);
                                minDp[start][end] = Math.min(minDp[start][end], minDp[start][middle] - maxDp[middle][end]);
                                break;
                        }

                    }
                }
            }
        }

        return maxDp[0][nlen-1];



    }

    public static void main(String []args){
        String[] ex ={"1", "-", "3", "+", "5", "-", "8"};
        System.out.println(solution(ex));
    }
}