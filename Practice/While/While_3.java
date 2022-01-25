package While;

import java.util.Scanner;

public class While_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 10) {
            n = 10 * n;
        }
        //먼저 주어진 수가 10보다 작다면 앞에 0을  두 자리 수로 만들고, 각 자리의 숫자를 더한다.
        int cycleNumber = 0;
        int internumber;
        int newnumber;
        int compare = n;
        while (true) {
            internumber = n / 10 + n % 10;
            newnumber = (internumber % 10) + (n % 10)*10;
            cycleNumber++;
            if (newnumber == compare) break;
            n =newnumber;
        }
        System.out.println(cycleNumber);
    }
}
