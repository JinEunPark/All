package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int size = Integer.valueOf(s);
        int[] ways = new int[size+1];
        if(size %2 != 0){
            System.out.println(0);
            return ;
        }
        ways[0] = 1;
        ways[1] = 0;
        ways[2] = 3;


        for(int i = 4; i<= size; i += 2){
            ways[i] += ways[i-2]*ways[2];
            for(int j = i-4; j >=0; j -= 2 ){
                ways[i] += (ways[j] *2);
            }
        }

        System.out.println(ways[size]);
    }



}
