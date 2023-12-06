package pro.q;
import java.util.*;

public class DFS {

    class Solution {
        static public void dfs(List<Set<Integer>> g, Set<Integer> visited, int index){
            Set<Integer> edges = g.get(index);

            if(g.get(index).size() == 0|| visited.containsAll(edges)){
                return;
            }

            for(int edge: edges){
                if(visited.contains(edge)){
                    continue;
                }else{
                    visited.add(edge);
                    dfs(g,visited,edge);
                }
            }
        }
        MimeBodyPart mimeBodyPart;
        public int solution(int n, int[][] results) {
            int answer = 0;


            List<Set<Integer>> winG = new ArrayList<>();
            List<Set<Integer>> loseG = new ArrayList<>();

            for(int i = 0; i <= n; i++){
                winG.add(new HashSet<>());
                loseG.add(new HashSet<>());
            }

            for(int i = 0; i< results.length; i++){
                winG.get(results[i][0]).add(results[i][1]);
                loseG.get(results[i][1]).add(results[i][0]);
            }

            List<Set<Integer>> dfsWin = new ArrayList<>();
            List<Set<Integer>> dfsLose = new ArrayList<>();

            for(int i = 0; i <= n; i++){
                dfsWin.add(new HashSet<>());
                dfsLose.add(new HashSet<>());
            }

            for(int i = 1; i <= n; i++){
                dfs(winG, dfsWin.get(i), i);
                dfs(loseG, dfsLose.get(i), i);
            }

            for(int i = 1; i <= n; i++){
                dfsWin.get(i).addAll(dfsLose.get(i));
                if(dfsWin.get(i).size() == n-1){
                    answer++;
                }
            }

            return answer;
        }
    }
}
