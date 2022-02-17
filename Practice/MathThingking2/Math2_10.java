package MathThingking2;

import java.io.*;
import java.util.StringTokenizer;

public class Math2_10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter sw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long z = Long.parseLong(st.nextToken());


            if (x == 0 && y == 0 && z == 0) {
                break;
            }


            if (x * x == y * y + z * z) {
                sb.append("rigth").append("\n");
            } else if (y * y == x * x + z * z) {
                sb.append("rigth").append("\n");
            } else if (z * z == x * x + y * y) {
                sb.append("rigth").append("\n");
            } else {
                sb.append("wrong").append("\n");}

        }
        sw.write(sb.toString());
        sw.flush();
        sw.close();

    }
}
