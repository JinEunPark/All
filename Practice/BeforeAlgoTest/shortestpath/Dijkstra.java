package BeforeAlgoTest.shortestpath;

import Math_thinking.Math_1;
import lastTest.CompositePattern.Menu;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {
    static final int INF = 987654321;
    static final int MAX_N = 10;
    static int N, E;//노드의 갯수와 간선의 갯수

    static int[][] Graph = new int[MAX_N][MAX_N];
    static int[] dist = new int[MAX_N];

    static void dijkstra(int src){
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a,b)->a[0]-b[0]);
        boolean[] visited = new boolean[MAX_N];
        for(int i = 0; i< N; i++){
            dist[i] = INF;
        }
        dist[src] = 0;
        priorityQueue.add(new int[]{0,src});

        while(!priorityQueue.isEmpty()){
            int[] curr = priorityQueue.poll();
            int u = curr[1];
            if(visited[u]) continue;

            visited[u] = true;
            for(int v = 0; v< N; v++){
                if(dist[v] > dist[u] + Graph[u][v]){
                    dist[v] = dist[u] + Graph[u][v];
                    priorityQueue.add(new int[]{dist[v],v});
                }
            }
        }


    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        E = scanner.nextInt();
        for(int i = 0; i<N; i++){
            for(int j = 0; j < N; j++){
                if(i==j) Graph[i][j] = 0;
                else Graph[i][j] = INF;
            }
        }


        for(int i = 0; i< N; i++){
            System.out.println(dist[i] + " ");
        }
    }
}
