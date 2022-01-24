package input_output_Stream;
import java.util.Scanner;
import java.io.*;
public class EX8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try{

            FileWriter f = new FileWriter("C:\\Users\\SAMSUNG\\OneDrive - 숭실대학교 - Soongsil University\\바탕 화면\\박진은\\Practice\\input_output_Stream\\Sample.txt");
            while(true){
                String line = scanner.nextLine();
                if(line.length()==0)break;
                f.write(line,0,line.length());
                f.write("\r\n",0,2);
            }
            f.close();
        }catch(IOException e) {
            System.out.println("출력오류가 발생했습니다");
        }
        scanner.close();
    }
}
