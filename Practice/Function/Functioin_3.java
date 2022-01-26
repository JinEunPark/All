package Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Functioin_3 {
    static int hanSu(int S) {

        int count = 0;
        for (int n = 0; n <= S; n++) {

            if (n > 0 && n < 100) count++;
            else if (n > 100 && n < 1000) {

                int a = n % 10;
                int b = n / 10 % 10;
                int c = n / 100;

                if ((a - b) == (b - c)) count++;

            }

        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(hanSu(N));
    }
}
