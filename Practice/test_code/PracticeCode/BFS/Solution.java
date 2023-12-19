package test_code.PracticeCode.BFS;//package test_code.PracticeCode.BFS;

import java.util.*;

class Solution {

    public int[][] copy(int[][] board){
        int[][] nBoard = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            nBoard[i] = board[i].clone();
        }
        return nBoard;
    }

    public boolean check(int[][] board, int x, int y){
        return (0 <= x && x < board.length && 0 <= y && y < board[0].length && board[x][y] == 1);
    }
    public class Loc{
        int x1;
        int y1;

        int x2;
        int y2;

        int count;

        int[][] board;

        public Loc(int x1, int y1, int x2, int y2, int count, int[][] board){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.count = count;
            this.board = board;
        }
    }
    public int solution(int[][] board, int[] aloc, int[] bloc) {

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int answer = -1;

        Stack<Loc> st = new Stack<>();
        st.add(new Loc(aloc[0], aloc[1], bloc[0], bloc[1], 0 ,board));

        while(!st.isEmpty()){
            Loc cur = st.pop();

            if(cur.count > answer){
                answer = cur.count;
            }

            for(int i = 0; i < 4; i++){
                if(cur.count % 2 == 0){

                    cur.board[cur.x1][cur.y1] = 0;

                    int nx1 = cur.x1 + dx[i];
                    int ny1 = cur.y1 + dy[i];

                    if(check(cur.board,nx1,ny1)){
                        st.push(new Loc(nx1, ny1, cur.x2, cur.y2, cur.count + 1, copy(cur.board)));
                    }

                }else{

                    cur.board[cur.x2][cur.y2] = 0;

                    int nx2 = cur.x2 + dx[i];
                    int ny2 = cur.y2 + dy[i];

                    if(check(cur.board,nx2,ny2)){
                        st.push(new Loc(cur.x1, cur.y1, nx2, ny2, cur.count + 1, copy(cur.board)));
                    }
                }
            }
        }
        return answer;
    }
}

import java.util.*;
class Solution {

    List<String> result = new ArrayList<>();



    public void getChild(int g, int s, Map<String, List<String>> map){
        if(g == 1){
            result.add("Rr");
        }
        int orig = g;

        int[] ga = new int[g+1];
        ga[1] = 1;
        ga[g] = s;

        while(g > 2){
            int v = s/4;
            int r = s%4;
            if(r != 0) v++;
            g--;
            ga[g] = v;
            s = ga[g];
        }
        String key = "Rr";
        List<String> child = map.get("Rr");
        for(int i = 1; i < ga.length-1; i++){
            System.out.println(key);

            child = map.get(key);
            key = child.get(ga[i+1]%4);
        }

        result.add(key);
        return;

    }
    public String[] solution(int[][] queries) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("RR", new ArrayList<>(){{
            add("RR");
            add("RR");
            add("RR");
            add("RR");

        }});
        map.put("rr", new ArrayList<>(){{
            add("rr");
            add("rr");
            add("rr");
            add("rr");
        }});
        map.put("Rr", new ArrayList<>(){{
            add("RR");
            add("Rr");
            add("Rr");
            add("rr");
        }});


        for(int[] query : queries){
            getChild(query[0], query[1], map);
        }

        String[] answer =  result.stream().toArray(String[]::new);
        return answer;
    }
}