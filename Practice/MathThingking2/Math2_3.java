package MathThingking2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math2_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[b + 1];

        prime[0] = prime[1] = true;// 소수에게 false를 부여함.

        for (int i = 2; i * i < b + 1; i++) {

            if (!prime[i]) {

                for (int j = i * i; j < b + 1; j += i) {
                    prime[j] = true;
                }
            }
        }

        int sum = 0;
        int min = b + 2;

        for (int i = a; i < b + 1; i++) {

            if (!prime[i]) {

                sum += i;

                if (min > i) {
                    min = i;
                }
            }
        }

        if (sum == 0) {

            System.out.print(-1);

        } else {
            System.out.println(sum);
            System.out.print(min);
        }

    }
}
