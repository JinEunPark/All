package Math_thinking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double V = Double.parseDouble(st.nextToken());
        double day = 1;
        if (V >A){
            day = (V - A) / (A - B) + 1;
            if((V - A) % (A - B)!=0)++day;
        }
        System.out.print((int)Math.ceil(day));
    }
}
