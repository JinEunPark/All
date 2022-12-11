package BeforeAlgoTest.shortestpath.bell;

public class Main {
    public static void main(String[]args){
            int V = 5; // Total vertices
            int E = 8; // Total Edges

            CreateGraph graph = new CreateGraph(V, E);

            // edge 0 --> 1
            graph.edges[0].startNode = 0;
            graph.edges[0].destination = 1;
            graph.edges[0].weight = 5;

            // edges 0 --> 2
            graph.edges[1].startNode = 0;
            graph.edges[1].destination = 2;
            graph.edges[1].weight = 4;

            // edges 1 --> 3
            graph.edges[2].startNode = 1;
            graph.edges[2].destination = 3;
            graph.edges[2].weight = 3;

            // edges 2 --> 1
            graph.edges[3].startNode = 2;
            graph.edges[3].destination = 1;
            graph.edges[3].weight = 6;

            // edges 3 --> 2
            graph.edges[4].startNode = 3;
            graph.edges[4].destination = 2;
            graph.edges[4].weight = 2;

            BellmanFord bel = new BellmanFord();
            bel.bellmanFord(graph, 0); // 0 is the source vertex

    }
}
