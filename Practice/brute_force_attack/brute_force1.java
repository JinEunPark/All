package brute_force_attack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class brute_force1 {
//    첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
//
//    합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
    public static int blackjack(int array[], int M) {
        int MaxSum = 0;

        int N = array.length;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int e = j + 1; e < N; e++) {
                    if (array[i] + array[j] + array[e] <= M && MaxSum < array[i] + array[j] + array[e]) {
                        MaxSum = array[i] + array[j] + array[e];
                    }
                }
            }
        }

        return MaxSum;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());//주어지는 카드의 갯수
        int M = Integer.parseInt(st.nextToken());// 주어지는 목표수의 크기

        StringTokenizer st2 = new StringTokenizer(br.readLine());       // 두번째 줄에 주어지는 카드의 갯수를 읽음


        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(blackjack(array, M));//배열을 전달할 때는 레퍼런스만을 전달할것 기억하자 진은아.

    }
}
