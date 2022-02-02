package MathThingking2;

import java.io.*;
import java.util.StringTokenizer;

public class math2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter sw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int found = 0;

        for (int i = 0; i < N; i++) {
            int count = 0;
            int a = Integer.parseInt(st.nextToken());
            for (int e = 1; e <= a; e++) {
                if (a % e == 0) {
                    count++;
                }
            }
            if (count == 2) {
                found++;
            }
        }
        sw.write(String.valueOf(found));
        sw.close();
    }
}
