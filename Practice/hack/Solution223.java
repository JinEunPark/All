//package hack;
//
//import java.util.*;
//
//class Solution223 {
////    class Solution {
//
//import java.util.*;
//    class Solution {
//        public static class Point{
//            int x;
//            int y;
//            Point(int x, int y){
//                this.x = x;
//                this.y = y;
//            }
//            public boolean equeals(Point p){
//                return (this.x == p.x) && (this.y == p.y);
//            }
//        }
//
//        public static boolean check(Point p, int[][] maps){
//            return (0 <= p.x && p.x <=101) && (0 <= p.y && p.y <=101) && (maps[p.y][p.x] == 1)&& (maps[p.y][p.x] != -1);
//        }
//
//        public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
//            int answer = 0;
//            int[][] maps = new int[102][102];
//            for(int i = 0; i< rectangle.length; i++){
//                for(int e =0; e < rectangle[0].length; e++){
//                    rectangle[i][e] *=2;
//                }
//            }
//
//            for(int i = 0; i < rectangle.length; i++){
//                int minX = rectangle[i][0];
//                int minY = rectangle[i][1];
//                int maxX = rectangle[i][2];
//                int maxY = rectangle[i][3];
//
//                for(int j = minX; j <= maxX; j++){
//                    maps[minY][j] = 1;
//                    maps[maxY][j] = 1;
//                }
//
//                for(int k = minY; k <= maxY; k++){
//                    maps[k][minX] =1;
//                    maps[k][maxX] =1;
//                }
//
//            }
//
//            for(int i = 0; i< rectangle.length; i++){
//                int minX = rectangle[i][0];
//                int minY = rectangle[i][1];
//                int maxX = rectangle[i][2];
//                int maxY = rectangle[i][3];
//
//                for(int e = minX +1; e < maxX; e++){
//                    for(int k = minY+1; k< maxY; k++){
//                        maps[k][e] = 0;
//                    }
//                }
//
//                Queue<Point> q = new ArrayDeque<>();
//                Point chraracter = new Point(characterX*2, characterY*2);
//                Point item = new Point(itemX*2, itemY*2);
//                q.add(chraracter);
//
//
//                int[][] recode = new int[maps.length][maps[0].length];
//                recode[chraracter.y][chraracter.x] = -1;
//
//
//                while(!q.isEmpty()){
//                    Point c = q.poll();
//
//                    if(c.equeals(item)){
//                        return recode[c.y][c.x]/2 + 1;
//                    }
//
//                    ArrayList<Point> plist = new ArrayList<>();
//                    plist.add(new Point(c.x,c.y +2));
//                    plist.add(new Point(c.x,c.y-2));
//                    plist.add(new Point(c.x+2,c.y));
//                    plist.add(new Point(c.x-2,c.y));
//
//
//                    for(Point p: plist){
//                        if(check(p, maps)){
//                            maps[p.y][p.x] = -1;
//                            recode[p.y][p.x] = recode[c.y][c.x] + 2;
//                            q.add(p);
//                        }
//                    }
//                }
//
//
//
//            }
//            return answer;
//        }
//    }
//
//        public static void main(String []args){
//            int[][] r = {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
//            int a = 1;
//            int b = 3;
//            int c = 7;
//            int d = 8;
//            solution(r,a,b,c,d);
//        }
//}
