package input_output_Stream;

import java.io.*;

public class EX8_6 {
    public static void main(String[] args) {
        byte[] b = new byte[6];
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\SAMSUNG\\OneDrive - 숭실대학교 - Soongsil University\\바탕 화면\\박진은\\Practice\\input_output_Stream\\test.out");
            int n = 0, c;
            while ((c = fin.read()) != -1) {
                b[n] = (byte) c;
                n++;
            }
            System.out.println("""
                    C:\\Users\\SAMSUNG\\OneDrive - 숭실대학교 - Soongsil University\\바탕 화면\\박진은\\Practice\\input_output_Stream\\test.out에서 읽은 배열을 출력합니다""");
            for (byte i : b)
                System.out.println(i + " ");
            System.out.println();
            fin.close();

        } catch (IOException e) {
            System.out.println("""
                    C:\\Users\\SAMSUNG\\OneDrive - 숭실대학교 - Soongsil University\\바탕 화면\\박진은\\Practice\\input_output_Stream\\test.out 파일경롤르 확인해 보세용""");
        }
    }
}
