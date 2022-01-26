package String_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//버퍼리더 생성
        String str = br.readLine();// 한줄 읽어오기
        int[] array = new int[26];

        for (int i = 0; i < 26; i++) {
            array[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (array[(int) str.charAt(i) - 97] != -1) continue;
            array[(int) str.charAt(i) - 97] = i;
        }//알파벳 영어 소문자의 아스키 코드는 97~122까지 총 26 개로 구성되어 있다 따라서 이것을 이용해서 영어 소문자를
        //정수형으로 바꾼다음에 여기다가 -97 을 한다음에 저장함.
        for (int i = 0; i < 26; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
