package hyundai;

import java.util.*;

class Solution {
    public static class Point implements Comparable<Point>{
        int x,y;
        Point(int x, int y ){
            this.x = x;
            this.y = y;
        }

        public String toString(){
            return x + " "+y;
        }

        public int compareTo(Point o){
            int result;
            result = this.x - o.x;
            if(result == 0){
                result = this.y - o.y;
            }
            return result;
        }

        @Override
        public boolean equals(Object o) {
            Point p = (Point) o;
            return (p.x == this.x && p.y == this.y);
        }
    }
    public static boolean check(Point p, int[][] table){
        return (p.x < table.length)&&(p.y < table[0].length)&&(p.x >= 0)&&(p.y >= 0)&&(table[p.x][p.y] == 1);
    }

    public static ArrayList<ArrayList<Point>> getblock(int[][] table){
        ArrayList<ArrayList<Point>> blocks = new ArrayList<>();

        for(int i = 0; i < table.length; i++){
            for(int e = 0; e < table[0].length; e++){
                ArrayList<Point> block = new ArrayList<>();

                if(table[i][e] == 1){

                    Queue<Point> q = new LinkedList<>();
                    Point c = new Point(i,e);
                    table[i][e] = 0;
                    q.add(c);
                    block.add(new Point(0,0));
                    while(!q.isEmpty()){
                        c = q.poll();
                        System.out.println(c);
                        ArrayList<Point> buf = new ArrayList<Point>();
                        buf.add(new Point(c.x-1,c.y));
                        buf.add(new Point(c.x+1,c.y));
                        buf.add(new Point(c.x,c.y-1));
                        buf.add(new Point(c.x,c.y+1));
                        for(Point p: buf){
                            if(check(p,table)){
                                q.add(p);
                                table[p.x][p.y] = 0;
                                block.add(new Point(p.x-i,p.y-e));//0,0 을 기준으로 저장함.
                            }
                        }
                    }
                    blocks.add(block);
                }
            }
        }
        return blocks;
    }


    public static int solution(int[][] game_board, int[][] table) {
        int answer = 0;
        for(int i = 0; i< game_board.length; i++){
            for(int e = 0; e < game_board[0].length; e++){
                if(game_board[i][e] == 0){
                    game_board[i][e] = 1;
                }else if(game_board[i][e] == 1){
                    game_board[i][e] = 0;
                }
            }
        }
        ArrayList<ArrayList<Point>> game_blocks = getblock(game_board);
        ArrayList<ArrayList<Point>> table_blocks = getblock(table);

        answer = compareBlocks(answer,game_blocks,table_blocks);
        if(answer == 0){
            return -1;
        }
        return answer;
    }

    public static boolean rotateCompare(ArrayList<Point> g, ArrayList<Point> t){
        Collections.sort(g);
        for(int j = 0; j < 4; j++){
            Collections.sort(t);
            int ax = t.get(0).x;
            int ay = t.get(0).y;
            for(int k = 0; k < t.size(); k++){
                t.get(k).x = t.get(k).x-ax;
                t.get(k).y = t.get(k).y-ay;
            }
            if(g.containsAll(t)){
                return true;
            }else{
                for(int i = 0; i <t.size(); i++){
                    int temp = t.get(i).x;
                    t.get(i).x = t.get(i).y;
                    t.get(i).y = -temp;
                }
            }

        }

        return false;
    }

    public static int compareBlocks(int answer, ArrayList<ArrayList<Point>> game_blocks, ArrayList<ArrayList<Point>> table_blocks){
        boolean[] visited = new boolean[table_blocks.size()];
        boolean[] visited2 = new boolean[game_blocks.size()];

        for(int i = 0; i < game_blocks.size(); i++){
            ArrayList<Point> g = game_blocks.get(i);
            for(int j = 0; j < table_blocks.size(); j++){
                if(!visited2[i]){
                    ArrayList<Point> t = table_blocks.get(j);
                    if(g.size() != t.size()){
                        continue;
                    }else if(!visited[j] && rotateCompare(g,t)) {
                        visited2[i] = true;
                        visited[j] = true;
                        answer += t.size();
                    }
                }

            }
        }
        return answer;
    }

}