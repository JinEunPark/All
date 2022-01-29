package Math_thinking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int step = 0;
        while (true) {
            if(target==1){
                step=1;
                break;
            }
            if (target <= 6 * (step * (step + 1) / 2) + 1) {
                ++step;
                break;
            }
            else step++;
        }
        System.out.print(step);
    }
}
