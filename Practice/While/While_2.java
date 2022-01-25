package While;
import java.util.*;

public class While_2 {
    public static void main(String[] args) throws Exception  {

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);

        }
        scanner.close();
    }
}
