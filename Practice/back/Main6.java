package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main6 {
    public static void main(String[] args) throws IOException {
        int N;
        int E;
        int R;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(br.readLine())-1;

        List<ArrayList<int[]>> g = new ArrayList<>();
        for(int i = 0; i< N; i++){
            g.add(new ArrayList<>());
        }

        int index = 0;
        while(index < E){
            String line = br.readLine();
            st = new StringTokenizer(line);
            int u = Integer.parseInt(st.nextToken())-1;
            int v = Integer.parseInt(st.nextToken())-1;
            int cost = Integer.parseInt(st.nextToken());
            g.get(u).add(new int[] {v, cost});

            index++;
        }

        PriorityQueue<int[]> nodes =new PriorityQueue<>((i,j)-> Integer.compare(i[1],j[1]));
        boolean[] visited = new boolean[N];
        nodes.add(new int[]{R,0});
        int[] dist = new int[N];
        Arrays.fill(dist, 99999999);
        dist[R] = 0;

        while(!nodes.isEmpty()){
            int[] current = nodes.poll();
            int u = current[0];
            if(visited[u]) continue;
            visited[u] = true;
            for(int[] ne: g.get(u)){
                int v = ne[0];
                if(!visited[v]){
                    if(dist[v] > dist[u] + ne[1]){
                        dist[v] = dist[u] + ne[1];
                        nodes.add(new int[] {v,dist[v]});
                    }
                }
            }
        }

        for(int i = 0; i< N; i++){
            if(dist[i] == 99999999){
                System.out.println("INF");
                continue;
            }
            System.out.println(dist[i]);
        }

    }
}
