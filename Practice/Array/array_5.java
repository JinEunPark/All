package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Double.parseDouble;

public class array_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double [] array = new double[Integer.parseInt(br.readLine())];
        st = new StringTokenizer(br.readLine());
        double max = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = parseDouble(st.nextToken());
            if (max < array[i]) max = (int) array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] / max) * 100;
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }
}
