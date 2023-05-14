package pHashMap;

import java.util.Arrays;

class Solution12 {
    public static int[] solution(long n) {
        int size = 0;
       while(n%10 != 0){
           n = n/10;
       size++;}

        int[] answer = new int[size];
        int i = 0;
        while(n != 0){
            long j = n%10;
            System.out.println(j);
            answer[i] = Long.valueOf(j).intValue();
            i++;
            n = n/10;
        }
        return answer;
    }

    public static void main(String[] args){
        int[] a = solution(54321);
        System.out.println(Arrays.toString(a));
    }
}