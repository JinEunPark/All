package duck;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine().replace(" ", ""));
        int[] maxs = new int[m];
        String input1 = br.readLine();
        String input2 = br.readLine();
        if (!(1 <= m && m <= 8 && input1.compareTo(input2) > 0)) {
            System.out.println(-1 + "");
        }
        StringTokenizer st = new StringTokenizer(input1);
        int c = 0;
        while (st.hasMoreTokens()) {
            int max = Integer.parseInt(st.nextToken());
            maxs[c] = max;
            c++;
        }

        int[] numbers = new int[m];
        int y = 0;
        st = new StringTokenizer(input2);
        while (st.hasMoreTokens()) {
            int init = Integer.parseInt(st.nextToken());
            numbers[y] = init + 1;
            y++;
        }

        int count = Integer.parseInt(br.readLine());

        int x = 0;
        int v = 0;
        int r = 0;

        while(x < m){
            v = (numbers[x] + count) / maxs[x];
            r = (numbers[x] + count) % maxs[x];
            numbers[x] = r;
            count = v;
            x++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}