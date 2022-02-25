package brute_force_attack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class brute_force2 {
    static ArrayList<Integer> arraylist = new ArrayList<>();

    public static int getSmallCreater(int N) {

        if (arraylist.size() == 0) return 0;

        Iterator<Integer> it = arraylist.iterator();
        int min = 1000001;
        int x;
        while (it.hasNext()) {

            x = it.next();

            if (x < min) {
                min = x;
            }

        }

        return min;
    }

    public static void getCreatnumber(int number, int MAX) {

        int sum = number;
        int prenumber = number;

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        if (sum == MAX)
            arraylist.add(prenumber);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            getCreatnumber(i, N);
        }
        System.out.print(getSmallCreater(N));
    }

//    어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
//
//    자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
}
