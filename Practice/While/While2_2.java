package While;

import java.util.*;
import java.io.*;

public class While2_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while ((str = rd.readLine()) != null) {
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }
        System.out.println(sb);
    }
}
