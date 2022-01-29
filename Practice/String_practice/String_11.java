package String_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str[] = new String[n];
        int count = 0;
        int same[] = new int[n];


        for (int e = 0; e < n; e++) {

            str[e] = br.readLine();

            for (int i = 0; i < str[e].length(); i++) {

                char c = str[e].charAt(i);

                if (i < str[e].length() - 1) {

                    for (int j = i + 1; j < str[e].length(); j++) {

                        char b = str[e].charAt(j);
                        if (c == b && j - i == 1) {
                            i = j;
                            continue;
                        } else if (c == b && j - i != 1) {
                            same[e]++;
                        }
                    }

                } else continue;
            }

        }
        for (int i = 0; i < n; i++) {
            if (same[i] == 0) {
                count++;
            }
        }
        System.out.print(count);

    }
}
