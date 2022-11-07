package algorithmAssigment.quicksort.version1;

import algorithmAssigment.MakeOutputFile;
import algorithmAssigment.ReadFileAndConvert;
import algorithmAssigment.SortMethod;
import algorithmAssigment.insertionsort.InsertionSort;
import algorithmAssigment.quicksort.QuickSort;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class QuickSortMainVersion1 {
    public static void main(String[]args)throws IOException {

        ReadFileAndConvert readFileAndConvert = new ReadFileAndConvert();
        ReadFileAndConvert readFileAndConvert1 = new ReadFileAndConvert();
        ReadFileAndConvert readFileAndConvert2 = new ReadFileAndConvert();
        ArrayList<Integer> list_32 = readFileAndConvert.readFile(new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_32.txt"));
        ArrayList<Integer> list2_32_sorted = readFileAndConvert1.readFile(new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_32_sorted.txt"));
        ArrayList<Integer> list3_1024 = readFileAndConvert2.readFile(new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_1024.txt"));


        SortMethod sortMethod = new QuickSort(new SelectPivotMostRight());
        long beforeTime1 = System.nanoTime(); //코드 실행 전에 시간 받아오기
        sortMethod.sort(list_32);
        long afterTime1 = System.nanoTime(); // 코드 실행 후에 시간 받아오기
        long secDiffTime1 = (afterTime1 - beforeTime1); //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime1);
        System.out.println("start:"+beforeTime1);
        System.out.println("end:"+afterTime1);

        long beforeTime2 = System.nanoTime(); //코드 실행 전에 시간 받아오기
        sortMethod.sort(list2_32_sorted);
        long afterTime2 = System.nanoTime(); // 코드 실행 후에 시간 받아오기
        long secDiffTime2 = (afterTime2 - beforeTime2); //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime2);
        System.out.println("start:"+beforeTime2);
        System.out.println("end:"+afterTime2);



        long beforeTime3 = System.nanoTime(); //코드 실행 전에 시간 받아오기
        sortMethod.sort(list3_1024);
        long afterTime3 = System.nanoTime(); // 코드 실행 후에 시간 받아오기
        long secDiffTime3 = (afterTime3 - beforeTime3); //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime3);
        System.out.println("start:"+beforeTime3);
        System.out.println("end:"+afterTime3);


        MakeOutputFile makeOutputFile = new MakeOutputFile();
        MakeOutputFile makeOutputFile1 = new MakeOutputFile();
        MakeOutputFile makeOutputFile2 = new MakeOutputFile();
        MakeOutputFile makeOutputFile3 = new MakeOutputFile();


        makeOutputFile.makeOutputFile("insertionSort - array size 32 reslut",
                list_32.toString(),
                new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/outputfile/quicksort/version1/quicksortArray_32_result_version1.txt"));
        makeOutputFile1.makeOutputFile("insertionSort - sorted_array size 32 reslut",
                list2_32_sorted.toString(),
                new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/outputfile/quicksort/version1/quicksortArray_32_sorted_result_version1.txt"));
        makeOutputFile2.makeOutputFile("insertionSort - array size 1024 reslut",
                list3_1024.toString(),
                new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/outputfile/quicksort/version1/quicksortArray_1024_result_version.txt"));
        makeOutputFile3.makeOutputFile("time runtime-\n", "\narraysize-30: "+secDiffTime1+"\n"+"time diff-"+"arraysize-30-sorted: "+secDiffTime2+"\n"+"time diff-"+"arraysize-1024: "+secDiffTime3+"\n"+"compare function count: "+sortMethod.comCount,
                new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/outputfile/quicksort/version1/timeReslt.txt"));

        System.out.println(list_32);
        System.out.println(list2_32_sorted);
        System.out.println(list3_1024);
    }
}
