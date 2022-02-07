package MathThingking2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Math2_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> a = new ArrayList<>();

        while (true) {

            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            int N = n * 2;

            boolean [] array = new boolean[N + 1];

            array[0] = array[1] = true;//소수를 false로 설정

            for (int i = 2; i * i <= N; i++) {// i 가 2 여야 제곱해서 커짐 이거 2로 설정한하고 1로 설정하면 무한루프 빙빙돈다.
                for (int j = i * i; j <= N; j += i) {
                    if (!array[j]) {
                        array[j] = true;
                    }
                }
            }

            int count = 0;


            for (int i = n+1; i <= N; i++) {
                if (!array[i]) {
                    ++count;
                }
            }
            a.add(count);
        }

        Iterator<Integer> it = a.iterator();//어래이 리스트의 잇트레이터 함수 호출해서 잇트렝터 객체생성함.

        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
