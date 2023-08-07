package back;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution12 {
    public int solution(int[][] relationships, int target, int limit) {
        int answer = 0;
        boolean[] visited = new boolean[101];
        int[] dis = new int[101];

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for(int i = 0; i< 101; i++){
            g.add(new ArrayList<>());
        }

        for(int i = 0; i< relationships.length; i++){
            g.get(relationships[i][0]).add(relationships[i][1]);
            g.get(relationships[i][1]).add(relationships[i][0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(target);
        visited[target] = true;
        dis[target] = 0;
        int count  = 0;
        while(!q.isEmpty()){
            int cur = q.poll();
            ArrayList<Integer> current  = g.get(cur);
            for(int i: current){
                if(!visited[i]){
                    visited[i] = true;
                    dis[i] = dis[cur] + 1;
                    if(dis[i] > limit){
                        break;
                    }else{
                        count++;
                        if(dis[i] == 1){
                            answer += 5;
                        }else if(dis[i]>1){
                            answer += 10;
                        }
                    }
                    q.add(i);
                }
            }

        }
        return answer;
    }
}
