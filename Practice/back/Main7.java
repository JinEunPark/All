package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main7 {

    static ArrayList<Integer> nodes = new ArrayList<>();
    static ArrayList<Integer> nodes2 = new ArrayList<>();

    public static void dfs(ArrayList<ArrayList<Integer>> g, int node, boolean[] visited){

        nodes.add(node);
        ArrayList<Integer> ne = g.get(node);

        for(Integer i: ne){
            if(!visited[i]){
                visited[i] = true;
                dfs(g,i,visited);
            }

        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int V;
        int N;
        int M;

        String firstLine = bf.readLine();
        StringTokenizer st = new StringTokenizer(firstLine);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N+1];
        boolean[] visited2 = new boolean[N+1];

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        ArrayList<ArrayList<Integer>> g2 = new ArrayList<>();

        for(int i = 0; i <= N; i++){
            g.add(new ArrayList<>());
            g2.add(new ArrayList<>());
        }

        int index = 0;

        while(M > index){

            String line = bf.readLine();
            st = new StringTokenizer(line);

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            g.get(start).add(end);
            g.get(end).add(start);
            g2.get(start).add(end);
            g2.get(end).add(start);

            index++;
        }

        for(int i = 0; i <= N; i++){
            g.get(i).sort(Integer::compareTo);
            g2.get(i).sort(Integer::compareTo);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        visited2[V] = true;

        while(!q.isEmpty()){
            int curr = q.poll();
            nodes2.add(curr);

            for(Integer i: g2.get(curr)){
                if(!visited2[i]){
                    visited2[i] = true;
                    q.add(i);
                }
            }
        }


        visited[V] = true;
        dfs(g,V,visited);

        StringBuilder sb = new StringBuilder();
        for(Integer i: nodes){
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.toString());


        sb = new StringBuilder();
        for(Integer i: nodes2){
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
