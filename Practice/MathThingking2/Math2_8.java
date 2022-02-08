package MathThingking2;

import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Math2_8 {
    //    한수
//    왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
//    직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
//첫째 줄에 x, y, w, h가 주어진다.
//첫째 줄에 문제의 정답을 출력한다.
    public static int findFastTrack(int x, int y, int w, int h) {

        int array[] = {x, y, Math.abs(w - x), Math.abs(h - y)};
        int min = 1001;
        for (int i = 0; i < 4; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        System.out.print(findFastTrack(x, y, w, h));

    }
}
