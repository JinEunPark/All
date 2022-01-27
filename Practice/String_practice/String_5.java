package String_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_5 {

    static void determine(String str, int[] array) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            for (int j = 0; j < 26; j++)
                if ((c - 'a') == j) array[j]++;
        }
        int Max = -1;
        int maxIndex = 0;
        for (int e = 0; e < 26; e++) {
            if (Max < array[e]) {
                maxIndex = e;
                Max = array[e];
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (Max == array[i]) count++;
        }
        if (count > 1) System.out.println("?");
        else {
            String a = String.valueOf((char) (maxIndex + 'a'));
            System.out.println(a.toUpperCase());
        }


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[26];
        String str = br.readLine();
        determine(str, array);

    }
}
