package back;

import java.util.*;

class Solution14 {
    public static class Point{
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            String a = ""+x+""+y;
            return Integer.parseInt(a);
        }

        @Override
        public boolean equals(Object obj) {
            Point p = (Point)obj;
            return x == p.x && y == p.y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public int solution(int A, int B, int C, int D, int N, int[][] Chips) {
        // 케이크: A cm x B cm
        // 직사각형 틀: C cm x D cm
        // 초콜릿 칩: N개
        // 초콜릿 칩의 좌표 xn, yn: (Chips[n-1][0], Chips[n-1][1])
        int answer = 0;
        ArrayList<Point> plist = new ArrayList<>();
        for(int i =0; i< Chips.length; i++){
            plist.add(new Point(Chips[i][0],Chips[i][1]));
        }

        Collections.sort(plist, (e1, e2) -> {
            if(e1.x == e2.x) {
                return e1.y - e2.y;
            }
            else {
                return e1.x - e2.x;
            }
        });

        System.out.println(plist);

        Point box = new Point(C,D);
        Point box2 = new Point(D,C);
        int max1 = 0, max2 = 0;

        max1 = getMax1(Chips, (ArrayList<Point>) plist, box, max1);

        max2 = getMax1(Chips, (ArrayList<Point>) plist, box2, max2);


        return max1 > max2 ? max1: max2;
    }

    private int getMax1(int[][] Chips, ArrayList<Point> plist, Point box, int max1) {
        for(int i = 0; i < Chips.length; i++){
            int c = 1;
            int j = i;
            Point p = plist.get(i);
            int px = p.x + box.x;
            int py = p.y + box.y;

            while(p.x != px && p.y != py|| p.x < plist.size()){
                j++;
                p = plist.get(j);
                c++;
            }
            if(c >max1){
                max1 = c;
            }
        }
        return max1;
    }
}
