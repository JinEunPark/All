package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];
        int max = 0;
        int indexNumber = 0;
        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());// bufferedreader 사용할 때는 항상 입출력 오류 예외처리 시행해줄것.
        }

        for (int i = 0; i < 9; i++) {
            if (max < array[i]) {
                max = array[i];
                indexNumber = i;
            }
        }
        System.out.print(max+"\n"+(indexNumber+1));

    }
}
