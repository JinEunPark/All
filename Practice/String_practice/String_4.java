package String_practice;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class String_4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arrays = new String[N];//테스트 케이스 수만큼 문자열 생성
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < N; i++) {
            arrays[i] = br.readLine();
            st = new StringTokenizer(arrays[i]);
            int cycle = Integer.parseInt(st.nextToken());// 가장 첫번째 반복횟수 정수로 받음
            String str = st.nextToken();

            for (int e = 0; e < str.length(); e++) for (int j = 0; j < cycle; j++) sb.append(str.charAt(e));
            System.out.println(sb);
            sb.setLength(0);// StringBuilder를 이용해기 위해서 삭제 보다 메모리를 적게 먹는 길이를 0으로 만드는 과정을 실행하였다
        }

    }
}
