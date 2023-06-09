package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static long answer = 0;
    public static void dfs(ArrayList<ArrayList<Integer>> graph,int current, int[] depth, int[] order, boolean[] visited) {
        visited[current] = true;
        order[0] +=1;
        order[current] = order[0];

        for (int next : graph.get(current)) {
            if (!visited[next]) {
                depth[next] = depth[current] +1;
                dfs(graph, next, depth, order, visited);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(firstLine, " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int R = Integer.parseInt(stringTokenizer.nextToken());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String edge = bufferedReader.readLine();
            StringTokenizer edgeTokenizer = new StringTokenizer(edge, " ");
            int u = Integer.parseInt(edgeTokenizer.nextToken());
            int v = Integer.parseInt(edgeTokenizer.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[N + 1];
        int[] order = new int[N+1];
        int[] dept = new int[N+1];

        Arrays.fill(dept,-1);

        for(ArrayList<Integer> list: graph){
            Collections.sort(list,Collections.reverseOrder());
        }

        dept[R] = 0;
        dfs(graph, R,dept , order, visited);


        for(int i = 1; i< N+1; i++){
            answer += (long)dept[i]*order[i];
        }

        System.out.println(answer);
    }
}
