package Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_1 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int e = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            array[e] = Integer.parseInt(st.nextToken());
            e++;
        }

        int max = array[0];
        int min = array[0];

        for (int i :array) {
            if (max < i) max = i;
            if (min > i) min = i;
        }
        System.out.println(min+ " "+ max);
    }
}
