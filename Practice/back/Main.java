package back;
import java.util.*;
import java.io.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
        public interface Check{
              boolean check (char[][]rgb, int x, int y, char alpha);

        }

    public static int bfs(char[][]rgb, int x, int y, Check check){
        char alpha = rgb[x][y];
        rgb[x][y] = '-';
        Queue<int[]> q = new LinkedList<>();
        int[] init = {x,y};
        q.add(init);
        int[][] directs = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int[] current = q.poll();
            for(int[] d: directs){
                int nx = current[0] + d[0];
                int ny = current[1] + d[1];

                if(check.check(rgb,nx,ny,alpha)){
                    int n[] = {nx, ny};
                    rgb[nx][ny] = '-';
                    q.add(n);
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        char[][] rgb = new char[N][N];
        char[][]rgb2 = new char[N][N];


        int answer = 0;
        int answer2 = 0;
        int index = 0;
        Check check = new Check() {
            @Override
            public boolean check(char[][] rgb, int x, int y, char alpha) {
                if(!(0<= x && rgb.length >x && 0<= y && rgb.length> y)){
                    return false;
                }else if(rgb[x][y]== '-'){
                    return false;
                }else if(alpha != rgb[x][y]){
                    return false;
                }
                return true;
            }
        };

        Check check1 = new Check() {
            @Override
            public boolean check(char[][] rgb, int x, int y, char alpha) {
                if(!(0<= x && rgb.length >x && 0<= y && rgb.length> y)){
                    return false;
                }else if(rgb[x][y]== '-'){
                    return false;
                }else if(alpha != rgb[x][y]){
                    if((alpha == 'R' &&  rgb[x][y]=='G')|| (alpha == 'G' && rgb[x][y] == 'R')){
                        return true;
                    }else{
                        return false;
                    }
                }
                return true;
            }
        };
        while(index < N ){
            char[] line = bf.readLine().toCharArray();
            for(int i = 0; i< N; i++){
                rgb[index][i] = line[i];
            }
            index ++;
        }
        for(int e = 0; e < N; e++){
            rgb2[e] = rgb[e].clone();
        }

        for(int i = 0; i< N; i++){
            for(int j= 0; j < N; j++){
                if(rgb[i][j] != '-'){
                    answer += bfs(rgb,i,j,check);
                }
            }
        }


        for(int i = 0; i< N; i++){
            for(int j= 0; j < N; j++){
                if(rgb2[i][j] != '-'){
                    answer2 += bfs(rgb2,i,j,check1);
                }
            }
        }

        System.out.println(answer + " "+ answer2);
    }
}
