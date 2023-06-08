package hyundai;

import java.util.*;
    class Solution {
//        static int answer = 0;
        public static int dfs(int start, Set<Integer> visited, Map<Integer, Set<Integer>> result, int n){
//            if(visited.size()==n){
//                answer++;
//            }
            Set<Integer> nodes = result.get(start);
            for(Integer i: nodes){
                if(!visited.contains(i)){
                    visited.add(i);
                    dfs(i,visited,result,n);
                }
            }
            return visited.size();
        }
        public static int solution(int n, int[][] results) {
            int answer =0;
            Map<Integer, Set<Integer>> result = new HashMap<>();
            Map<Integer, Set<Integer>> result2 = new HashMap<>();

            for(int i = 1; i<= n; i++){
                Set<Integer> losers = new HashSet<>();
                Set<Integer> winners = new HashSet<>();

                result.put(i,losers);
                result2.put(i,winners);

            }

            for(int i = 0; i< results.length; i++){
                int w = results[i][0];
                int l = results[i][1];

                result.get(l).add(w);
                result2.get(w).add(l);
            }


            int[] bit = new int[n];
            for(int j = 1; j<=n; j++){
                Set<Integer> visited = new HashSet<>();
                Set<Integer> visited2 = new HashSet<>();
                visited.add(j);
                int a = dfs(j,visited,result,n);
                int b = dfs(j,visited2,result2,n);
                if((a+b) == n){
                    answer++;
                }
            }


            return answer;
        }
        public static void main(String args[]){
            int[][] r = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
            int n = 5;
            System.out.println(solution(n,r));
        }
    }

