package Math_thinking;

import java.io.*;
import java.util.StringTokenizer;

public class Math_8 {
    public static long fly(long start, long destination) {
        long distacne = destination - start;
        long max;
        long count;
        max = (int) Math.sqrt(distacne);
        if (max == Math.sqrt(distacne)) {
            count = max * 2 - 1;
        } else {
            if (distacne <= max * max + max) {
                count = max * 2;
            } else {
                count = max * 2 + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            long start = (long) Integer.parseInt(st.nextToken());
            long destination = (long) Integer.parseInt(st.nextToken());

            sb.append(fly(start, destination)).append("\n");//String 타임으로 전환할 필요가 없음
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
