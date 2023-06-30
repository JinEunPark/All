package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line  = bf.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] p = new int[N+1][K+1];
        int[] value = new int[N+1];
        int[] weight = new int[N+1];


        int index = 0;
        while(index < N){
            line = bf.readLine();
            st = new StringTokenizer(line);
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            value[index] = v;
            weight[index] = w;

            index++;
        }

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=K; j++) {
                p[i][j] = p[i-1][j];     // 이전 행 결과 복사
                if(j - weight[i-1]>=0) {    // 무게가 남으면
                    p[i][j] = Math.max(p[i][j], p[i-1][j-weight[i-1]]+value[i-1]); // 더 큰 값으로 갱신
                }
            }
        }

        System.out.println(p[N][K]);
    }
}
