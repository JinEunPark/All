package hyundai;

import java.util.*;

class Solutio2233n {
    public static class Vector implements Comparable<Vector> {
        int start;
        int end;
        int cost;

        public Vector(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        public int compareTo(Vector v) {
            return this.cost - v.cost;
        }

        public String toString() {
            return start + " " + end + " " + cost;
        }
    }

    public int findParent(int node, int[] parent) {
        while(parent[node]>=0){
            node = parent[node];
        }
        return node;
    }

    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        ArrayList<Vector> vlist = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            vlist.add(new Vector(costs[i][0], costs[i][1], costs[i][2]));
        }
        Collections.sort(vlist);
        System.out.println(vlist);

        int accept = 0;
        int index = 0;

        while (accept < n - 1) {
            Vector v = vlist.get(index);
            int st = v.start;
            int ed = v.end;

            int pt = findParent(st, parent);
            int pe = findParent(ed, parent);

            if (pt != pe) {
                parent[pe] = pt;
                answer += v.cost;
                accept++;
            }

            index++;
        }

        return answer;
    }
}
