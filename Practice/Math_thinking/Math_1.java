package Math_thinking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int fixCost = Integer.parseInt(st.nextToken());
        int flexableCost = Integer.parseInt(st.nextToken());
        int saleCost = Integer.parseInt(st.nextToken());
        long BreakPoint = 1;
        if (saleCost > flexableCost) BreakPoint = (int) fixCost / (saleCost - flexableCost)+1;
        else BreakPoint = -1;

        System.out.print(BreakPoint);
    }
}
