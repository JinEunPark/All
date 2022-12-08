package BeforeAlgoTest.shortestpath.d;

import java.io.*;
import java.util.*;

public class Dijstra2 {
    //인접 시스트로 표현할 그래프를 선언함.
    static final List<List<Node>> graph = new ArrayList<>();
    //상수 무한데를 선언함
    static final int INF = Integer.MAX_VALUE;
    //다른 경로로 가는 최소 비용을 저장할 배열을 선언함.
    static int [] result;

    static boolean visited[];

    public static void main(String []args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String [] info = bufferedReader.readLine().split(" ");//첫번째 줄 읽어서 만듦

        int startIndex = Integer.parseInt(bufferedReader.readLine());//두번째 줄 읽어서 시작지점 읽음

        for(int i = 0; i< Integer.parseInt(info[0])+1; i++){//주어진 벌텍스 만큼 반복하기 위해서 사용함. +1 은 < 때문에 사용함.
            graph.add(new ArrayList<>());//일단 주어진 벌텍스 수많큼 실행함.
        }

        result = new int[Integer.parseInt(info[0])+1];
        Arrays.fill(result,INF);
        //최단 거리를 저장할 태이블을 생성하고 이를 무한대로 초기화함.

        visited = new boolean[Integer.parseInt(info[0]+1)];




        //인접 행렬을 이용해서 간선을 초기화함.
        for(int i = 1; i< Integer.parseInt(info[1])+1; i++){
            String tmp[] = bufferedReader.readLine().split(" ");
            graph.get(Integer.parseInt(tmp[0])).add(new Node(Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]) ));
        }
        dijkstra(startIndex);

        for(int i = 0; i< result.length; i++){
            if(result[i]==INF){
                bufferedWriter.write("INF");
                bufferedWriter.newLine();
            }else{
                bufferedWriter.write(String.valueOf(result[i]));
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.flush();


    }
    public static void dijkstra(int index){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        result[index] = 0;
        pq.offer(new Node(index,0));//index로 시작해서 자기 자신으로 가는데 0 넣음.

        while(!pq.isEmpty()){

            Node node = pq.poll();//q에서 하나를 꺼내는데 처음에는 시작 지점의 node임.

            int nodeIndex = node.index;
            int distance = node.distance;

            if(visited[nodeIndex]){
                continue;
            }else{
                visited[nodeIndex] = true;
            }

            if(distance>result[nodeIndex]){
                continue;
            }else{

            }

            for(Node linkedNode : graph.get(nodeIndex)){

                if(distance + linkedNode.distance < result[linkedNode.index]){
                    result[linkedNode.index] = distance + linkedNode.distance;
                    pq.offer(new Node(linkedNode.index, result[linkedNode.index]));

                }
            }


        }

    }

    public static class Node implements Comparable<Node>{
        int index;
        int distance;

        Node(int index, int distance){
            this.index = index;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.distance, o.distance);

        }
    }
}
