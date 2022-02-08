package MathThingking2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
//세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
public class Math2_9 {
    IOException i = new IOException();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static String getLocation  (int location [][] ) throws IOException {// 예외 처리 함수 바디 바로 앞에서

        for(int i  = 0; i<location.length; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j<location[0].length; j++){

                location[i][j] = Integer.parseInt(st.nextToken());
            }
        }// 좌표 입력을 끝냄;
        int x = 0;
        int y = 0;

        if(location[0][0]-location[1][0] == 0){
            x = location[2][0];
        }else if(location[0][0]-location[2][0] == 0){
            x=location[1][0];

        }else x = location[0][0];

        if(location[0][1]-location[1][1] == 0){
            y = location[2][1];
        }else if(location[0][1]-location[2][1] == 0){
            y =location[1][1];

        }else y = location[0][1];

        String str = String.valueOf(x) +" "+ String.valueOf(y);
        return str;
    }
    public static void main(String[] args) throws IOException {//위에 매소드 정의 할 때 사용한 IOException을 사용한 br.readLine()
        //을 사용했기 때문에 이 예외 처리가 발생한것인지 다른 사람한테 물어보고 싶은데 내가 물어보는 방법을 모르겠음 일단 컴파일러가 하라는 데로 하긴함

        int location [][] = new int [3][2];

        System.out.print( getLocation(location) );

    }
}
