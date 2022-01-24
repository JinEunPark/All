package input_output_Stream;
import java.io.*;
public class EX8_5 {
    public static void main(String[] args) {
        byte[] b = {7,51,3,4,-1,24};
        try{
            FileOutputStream fo = new FileOutputStream("C:\\Users\\SAMSUNG\\OneDrive - 숭실대학교 - Soongsil University\\바탕 화면\\박진은\\Practice\\input_output_Stream\\test.out");
            for(byte i : b){
                fo.write(i);
            }
            fo.close();

        }catch(IOException e){
            System.out.println("파일을 저장할 수 없습니다, 파일 경로명을 확인해 주세용");
            return;
        }
        System.out.println("C:\\\\Users\\\\SAMSUNG\\\\OneDrive - 숭실대학교 - Soongsil University\\\\바탕 화면\\\\박진은\\\\Practice\\\\input_output_Stream\\\\test.out\"파일을 저장 완료하였습니다");
    }
}
