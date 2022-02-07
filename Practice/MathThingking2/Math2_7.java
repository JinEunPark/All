package MathThingking2;

import java.io.*;
import java.util.ArrayList;

public class Math2_7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {

            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> arraylist = new ArrayList<>();



            boolean ab[] = new boolean[n + 1];
            ab[0] = ab[1] = true;

            for (int e = 2; e <= n; e++) {
                for (int j = e * e; j <= n; j += e) {
                    if (!ab[j]) ab[j] = true;
                }
            }
            for (int e = 0; e <= n; e++) {
                if (!ab[e]) {
                    arraylist.add(e);
                }
            }

            int different = 10001;
            int x = 0, y = 0;

            for (int j = 0; j < arraylist.size(); j++) {

                for (int e = 0; e < arraylist.size(); e++) {

                    if (arraylist.indexOf(j) + arraylist.indexOf(e) == n) {

                        if (Math.abs(arraylist.indexOf(e) - arraylist.indexOf(j)) < different) {
                            different = arraylist.indexOf(e) - arraylist.indexOf(j);
                            x = arraylist.indexOf(j);
                            y = arraylist.indexOf(e);
                        }

                    }

                }
            }

            sb.append(x).append(" ").append(y).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
