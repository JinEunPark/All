package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bufferedReader.readLine());

        int[] mod = new int[X+4];
        mod[0] = 0;
        mod[1] = 0;
        mod[2] = 1;
        mod[3] = 1;



        for(int i = 4; i<= X; i++){
            int[] results = new int[4];
            Arrays.fill(results,Integer.MAX_VALUE);

            if(i % 2 == 0){
                results[0] = mod[i/2] + 1;
            }
            if(i % 3 == 0){
                results[1] = mod[i/3] + 1;
                results[2] = mod[i/2] + 2;
            }
            results[3] = mod[i-1] +1;
            mod[i] = Arrays.stream(results).min().getAsInt();

        }
        System.out.println(mod[X]);
    }
}
