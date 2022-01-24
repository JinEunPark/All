package input_output_Stream;
import java.util.Scanner;
import java.io.*;
public class EX8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try{

            FileWriter f = new FileWriter("C:\\Users\\SAMSUNG\\OneDrive - 숭실대학교 - Soongsil University\\바탕 화면\\박진은\\Practice\\input_output_Stream\\Sample.txt");// 파일과 연결된 추력 문자 스트림 생성
            while(true){
                String line = scanner.nextLine();// 빈칸을 포함하여 한줄 읽기
                if(line.length()==0)break;//한 줄에 enter만 입력한경우 반복문을 빠져나옴
                f.write(line,0,line.length());//f.write(line)과 동일 그리고 이게 무슨뜻이냐면 String line의 배열을 처음부터 끝까지 받아드린다는 뜻
                f.write("\r\n",0,2);//f.write("/r/n")과 동일한 경우이며 이는 둘바꿈을 위해서 추가함.
            }
            f.close();//출력스트림을 닫음
        }catch(IOException e) {
            System.out.println("출력오류가 발생했습니다");
        }
        scanner.close();
    }
}
