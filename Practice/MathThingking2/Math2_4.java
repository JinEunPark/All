package MathThingking2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Math2_4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rest = 1;
        ArrayList<Integer> a = new ArrayList<>();
        int i = 2;

        while (true) {

            if (n % i == 0) {
                a.add(i);
                n = n/i;
            } else if(n % i != 0){
                i++;
            }
            if(n==1)break;
        }

       for (Integer c : a){
           System.out.println(c);
       }


    }


}
