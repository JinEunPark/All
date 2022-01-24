package input_output_Stream;
import java.io.*;
import java.util.Scanner;

public class EX8_7 {
    public static void main(String[] args) throws Exception {
        FileReader fin = new FileReader("C:\\Users\\SAMSUNG\\OneDrive - 숭실대학교 - Soongsil University\\바탕 화면\\박진은\\Practice\\input_output_Stream\\text2.txt");
        int c;
        BufferedOutputStream bos = new BufferedOutputStream(System.out, 5);
        while((c=fin.read())!=-1){//반복문을 통해서 버퍼에 한번 저장하고 나머지를 한번에 버퍼에 저장함.
            bos.write(c);
        }
        new Scanner(System.in).nextLine();
        bos.flush();//버퍼에 남아 있던 문자 모두 출력
        fin.close();
        bos.close();
    }
}
