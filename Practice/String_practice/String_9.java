package String_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_9 {
    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - 1) {

                if (str.charAt(i) == 'c' && str.charAt(i + 1) == '=') {
                    count++;
                    ++i;
                } else if (str.charAt(i) == 'c' && str.charAt(i + 1) == '-') {
                    count++;
                    ++i;
                } else if (str.charAt(i) == 'd' && str.charAt(i + 1) == '-') {
                    count++;
                    ++i;
                } else if (str.charAt(i) == 'l' && str.charAt(i + 1) == 'j') {
                    count++;
                    ++i;
                } else if (str.charAt(i) == 's' && str.charAt(i + 1) == '=') {
                    count++;
                    ++i;
                } else if (str.charAt(i) == 'z' && str.charAt(i + 1) == '=') {
                    count++;
                    ++i;
                } else if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'j') {
                    count++;
                    ++i;
                }
            } else if ((i <= str.length() - 2) && (str.charAt(i) == 'd' && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=')) {
                count++;
                i += 2;
            } else count++;

        }

        System.out.print(count);
    }
}
