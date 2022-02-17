package MathThingking2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math2_12 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static String findEnemy(int T) throws IOException {//사용할 때 항상 예외처리 할것

        int[] find = new int[T];
        for (int i = 0; i < T; i++) {

            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double distance_terat = (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            if (distance_terat == 0 && r1 == r2) {
                find[i] = -1;
            } else if (distance_terat > Math.pow(r1 + r2, 2)) {//원이 외부에서 만나지 않을때
                find[i] = 0;
            } else if (distance_terat < Math.pow(r1 - r2, 2)) {//원이 내부에 포함되고 내접하지 않을때 원의 중심사이의 거리 + 다른원 반지름의 길이<큰원 반지름의 길이
                //이걸 이항하면 if문과 같은 식이 나온다.
                find[i] = 0;
            } else if (distance_terat == Math.pow(r1 - r2, 2)) {//원이 내접할때
                find[i] = 1;
            } else if (distance_terat == Math.pow(r1 + r2, 2)) {//원이 외접할때
                find[i] = 1;
            } else {//원이 2점에서 만날때
                find[i] = 2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(find[i]).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());
        String result = findEnemy(T);

        System.out.print(result);
    }
}

