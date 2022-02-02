package Math_thinking;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Math_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bt = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        BigInteger add = A.add(B);
        bt.write(String.valueOf(add));
        bt.close();
    }
}
