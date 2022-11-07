package algorithmAssigment;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MakeInputFile {
    public void makeInputfile(String array_32, String array_32_sorted, String array_1024, String array_1024_sorted) throws IOException {

        File file = new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_32.txt");
        if (!file.exists()) {
            file.createNewFile();
        }else{
            file.delete();
            file.createNewFile();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.write(array_32);
        writer.flush();
        writer.close();

        File file2 = new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_32_sorted.txt");
        if (!file2.exists()) {
            file2.createNewFile();
        }else{
            file2.delete();
            file2.createNewFile();
        }
        BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2, true));
        writer2.write(array_32_sorted);
        writer2.flush();
        writer2.close();

        File file3 = new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_1024.txt");
        if (!file3.exists()) {
            file3.createNewFile();
        }else{
            file3.delete();
            file3.createNewFile();
        }
        BufferedWriter writer3 = new BufferedWriter(new FileWriter(file3, true));
        writer3.write(array_1024);
        writer3.flush();
        writer3.close();

        File file4 = new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_1024_sorted.txt");
        if (!file4.exists()) {
            file4.createNewFile();
        }else{
            file4.delete();
            file4.createNewFile();
        }
        BufferedWriter writer4 = new BufferedWriter(new FileWriter(file4, true));
        writer4.write(array_1024_sorted);
        writer4.flush();
        writer4.close();

    }

    public void makeRandomArray() throws IOException {
        String array_32;
        String array_32_sorted;
        String array_1024;
        String array_1024_sorted;

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            list.add(random.nextInt(10000));
        }
        array_32 = list.toString();
        Collections.sort(list);
        Collections.reverse(list);
        array_32_sorted = list.toString();

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 1024; i++) {
            list2.add(random.nextInt(10000));
        }
        array_1024 = list2.toString();
        Collections.sort(list2);

        array_1024_sorted = list2.toString();
        makeInputfile(array_32, array_32_sorted, array_1024, array_1024_sorted);

        System.out.println("1"+array_32);
        System.out.println("2"+array_32_sorted);
        System.out.println("3"+array_1024);
        System.out.println("4"+array_1024_sorted);
    }


}
