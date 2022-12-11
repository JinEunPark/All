package BeforeAlgoTest.shortestpath.bell;

public class BellmanFord {

    public boolean bellmanFord(CreateGraph graph, int start) {

        //그래프를 저장함.
        int vertex = graph.vertex;//그래프의 정점의 수를 저장
        int edge = graph.edge;//그래프의 간선의 수를 저장함.

        int dist[] = new int[vertex];//전임자를 저장함 여기서 저장해야 각가의 인덱스가 정점을 나타내소 값이 그 정점으로 가는데 드는 비용을 나타낸다.

        for (int i = 0; i < vertex; i++) {//최댓 값으로 초기화를 진행함.
            dist[i] = Integer.MAX_VALUE;
        }

        dist[start] = 0;// 시작하는 지점을 0으로 설정함.

        for (int i = 0; i < vertex - 1; i++) {//반북문을 정점의 갯 수 보다 하나 작게 선언함
            for (int j = 0; j < edge; j++) {//간선의 수많큼 relaxation을 진행함

                int u = graph.edges[j].startNode;
                int v = graph.edges[j].destination;
                int w = graph.edges[j].weight;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {//만일 가장 높은 값이 아니라면
                    dist[v] = dist[u] + w;
                }

            }
        }

        for (int i = 0; i < edge; i++) {//릴렉세이션을 한번더 진행해서 릴렉세이션이 발생하면 음수 싸이클이 존재하는 것으로 판단한다.
            int u = graph.edges[i].startNode;
            int v = graph.edges[i].destination;
            int w = graph.edges[i].weight;

            if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                System.out.println("there is mius cycle");
                return false;
            }


        }
        printSolution(dist, vertex);
        return true;
    }

    void printSolution(int dist[], int vertex) {
        System.out.println("vertex distance from source");
        for (int i = 0; i < vertex; i++)
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(i+ "\t\t --->INF");
            } else {
                System.out.println(i + "\t\t --->" + dist[i]);
            }

    }

}
