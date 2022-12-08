package BeforeAlgoTest.shortestpath.d;

public class Node implements Comparable<Node>{
    int index;
    int distance;

    Node(int index, int distance){
        this.index = index;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node node) {
        return Integer.compare(this.distance, node.distance);

    }
}
