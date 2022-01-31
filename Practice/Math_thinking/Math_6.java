package Math_thinking;

import java.io.*;

public class Math_6 {
    public static int get_people(int k, int n) {
        if (n == 0) {
            return 0;
        } else if (k == 0) {
            return n;
        }
        return get_people(k, n - 1) + get_people(k - 1, n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(get_people(k, n)).append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.close();
    }
} //케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다
