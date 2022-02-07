package MathThingking2;

import java.io.*;

public class Math2_7_2 {
    public static void getPrime(boolean prime[]) {

        prime[0] = prime[1] = true;//소수는 false
        for (int i = 2; i * i < prime.length; i++) {
            for (int j = i * i; j < prime.length; j += i) {
                if (!prime[j]) prime[j] = true;
            }
        }
    }
    public static void decision(int n, boolean [] prime, StringBuilder sb){
        int x = n / 2;
        int y = n - x;

        if (!prime[x] && !prime[y]) {//둘다 소수라면
            sb.append(x).append(" ").append(y).append("\n");
        } else {
            while (true) {
                if(prime[x] && prime[y]){
                    y++;
                    x--;
                }
                if (!prime[x] && prime[y]) {
                    y++;
                    x--;
                } else if (prime[x] && !prime[y]) {
                    y++;
                    x--;
                }
                if (!prime[x] && !prime[y]) {
                    sb.append(x).append(" ").append(y).append("\n");
                    break;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[10001];
        getPrime(prime);

        for (int i = 0; i < T; i++) {

            int n = Integer.parseInt(br.readLine());
            decision(n,prime,sb);

        }

        bw.write(sb.toString());
        bw.close();

    }
}
