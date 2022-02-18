package recurlsive_function;

import java.io.*;

public class recursiveFunction_3 {
    static char[][] arr;// 별을 그릴 2차원 배열 생성  메인 메소드 밖에서 사용할 수 있도록 static 으로 선언함

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());//사이즈를 변수로 전달받음.
        arr = new char[N][N];

        drawStar(0, 0, N, false);

        for (int i = 0; i < N; i++) {
            bw.write(arr[i]);
            bw.write("\n");
        }
        bw.close();
    }

    public static void drawStar(int x, int y, int N, boolean blank) {

        if (blank) {//blank 라는 상수가 true라면 주어진 좌표와 사이즈 만큼의 공백 삽입하고 메소드 종료;

            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        if (N == 1) {// 더이상 분해될 수 없는 블록으로 설정하고 별 삽입하고 메소드 종료
            arr[x][y] = '*';
            return;
        }

        int size = N / 3;
        int count = 0;

        for (int i = x; i < x + N; i += size) {// 사이즈 만큼 증가하는 반복문 실행
            for (int j = y; j < y + N; j += size) {

                count++;//출력된 별의 갯수를 세는 변수
                if (count == 5)
                    drawStar(i, j, size, true);//공백칸 호출
                else {
                    drawStar(i, j, size, false);//별삽입
                }
            }
        }
    }


}

