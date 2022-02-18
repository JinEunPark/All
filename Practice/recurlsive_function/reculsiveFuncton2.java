package recurlsive_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reculsiveFuncton2 {
    public static int Fibonacci(int x){
        if(x == 0){
            return 0;
        }else if( x == 1){
            return 1;
        }
        return Fibonacci(x-1)+Fibonacci(x-2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.print(Fibonacci(x));

    }
}
