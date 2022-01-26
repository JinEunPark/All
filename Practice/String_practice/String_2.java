package String_practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        br.close();
        int sum =0;
        for(int i =0; i<N; i++) sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        System.out.println(sum);

    }
}
