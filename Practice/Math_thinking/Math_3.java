package Math_thinking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int n = 1;

        while (true) {
            if (x == 1) {
                break;
            }
            if (x > ((n + 1) * n / 2)) {
                ++n;
            } else if (x <= (n + 1) * n / 2) {
                break;
            }

        }
        if (n % 2 == 0) {
            int turn = x - ((n - 1) * (n) / 2) - 1;
            int head = 1 + turn;
            int body = n - turn;
            System.out.print(head + "/" + body);
        } else {
            int turn = x - ((n - 1) * (n) / 2) - 1;
            int head = n - turn;
            int body = 1 + turn;
            System.out.print(head + "/" + body);
        }

    }

}
