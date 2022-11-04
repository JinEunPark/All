package algorithmAssigment;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReadFileAndConvert {


    File file;
    char charArray[];
    ArrayList<Integer> list = new ArrayList<>();


    public ArrayList<Integer> readFile(File file) throws IOException {
        this.file = file;
        if (file.exists()) {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("file content_____________");
            String line = bufferedReader.readLine();
            System.out.println(line);
            StringTokenizer stringTokenizer = new StringTokenizer(line, "[], ", false);
            System.out.println(stringTokenizer.countTokens());

            while (stringTokenizer.hasMoreTokens()) {
                list.add(Integer.valueOf(stringTokenizer.nextToken()));
            }
            bufferedReader.close();
            fileReader.close();


        }


        return list;
    }
}
