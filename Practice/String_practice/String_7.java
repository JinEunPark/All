package String_practice;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class String_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer(st.nextToken());
        StringBuffer sb2 = new StringBuffer(st.nextToken());
        sb = sb.reverse();
        sb2 = sb2.reverse();
        int a = Integer.parseInt(sb.toString());
        int b = Integer.parseInt(sb2.toString());
        int answer = (a > b) ? a : b;
        System.out.println(answer);
    }
}
