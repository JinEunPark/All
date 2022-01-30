package Math_thinking;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result[] = new int[n];

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int stear = Integer.parseInt(st.nextToken());
            st.nextToken();
            int order = Integer.parseInt(st.nextToken());
            int y = order % stear;
            int ho = order / stear;
            if (y != 0) {
                ho++;
                result[i] = ho + y * 100;
            } else {
                result[i] = ho + y * 100;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
