package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class f {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int scount = 0;
        for (int i = 0; i < n; i++) {
            String r = br.readLine();
            for (int e = 0; e < r.length(); e++) {
                if (r.charAt(e) == 'O') {
                    count++;
                    scount += count;
                }else{
                    count = 0;
                }
            }
            System.out.println(scount);
            scount = 0;
            count = 0;


        }

    }
}
