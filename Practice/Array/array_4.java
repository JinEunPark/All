package Array;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            h.put(a%42,a%42);
        }
        System.out.print(h.size());
    }
}
