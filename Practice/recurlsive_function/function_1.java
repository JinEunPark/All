package recurlsive_function;
import java.util.Scanner;
public class function_1 {
    public static int factorial(int x){
        if(x == 0){
            return 1;
        }else {
            return x * factorial(x - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = factorial(x);
        System.out.print(result);
    }
}
