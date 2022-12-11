package BeforeAlgoTest.shortestpath.bell;

public class CreateGraph {

    class CreateEdge{
        int startNode,destination ,weight;
        CreateEdge(){
            startNode = destination = weight = 0;
        }
    };

    int vertex, edge; //간선과 노드의 갯수

    CreateEdge edges[];

    //정점 수많큼 그래프를 생성함
    CreateGraph(int vertexNum, int edgeNum){
        vertex = vertexNum;
        edge = edgeNum;

        edges = new CreateEdge[edgeNum];

        for(int i = 0; i< edgeNum; i++){
            edges[i] = new CreateEdge();
        }

    }
}

