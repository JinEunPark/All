package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[3];
        int result = 1;

        for (int i = 0; i < 3; i++) {
            array[i] = Integer.parseInt(br.readLine());
            result *= array[i];
        }

        String result_s = String.valueOf(result);

        int numberArray[] = new int[10];

        for (int i = 0; i < result_s.length(); i++) {

            switch (result_s.charAt(i)) {
                case '0':
                    numberArray[0]++;
                    break;
                case '1':
                    numberArray[1]++;
                    break;
                case '2':
                    numberArray[2]++;
                    break;
                case '3':
                    numberArray[3]++;
                    break;
                case '4':
                    numberArray[4]++;
                    break;
                case '5':
                    numberArray[5]++;
                    break;
                case '6':
                    numberArray[6]++;
                    break;
                case '7':
                    numberArray[7]++;
                    break;
                case '8':
                    numberArray[8]++;
                    break;
                case '9':
                    numberArray[9]++;
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numberArray[i]);
        }

    }

}
