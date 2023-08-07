package back;

import java.util.*;
class Solution10 {
    public int[] solution(int n) {
        int[] answer = {};
        int[][] directions = {{1,0},{0,1},{-1,-1}};//밑 오 왼위

        int[][] buf = new int[n][n];

        int target = n*(n+1)/2+1;

        int v = 1;
        int x = 0;
        int y = 0;
        int d = 0;

        while(target != v){

            buf[x][y] = v;
            v++;

            if( x + directions[d][0] > n-1|| y + directions[d][1] > n-1
                    || buf[x + directions[d][0]][y + directions[d][1]] != 0 ){

                    d++;
                d = d%3;
            }

            x = x + directions[d][0];
            y = y + directions[d][1];
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i< buf.length; i++){
            for(int j =0; j < i+1; j++){
                arr.add(buf[i][j]);
            }
        }

        answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}