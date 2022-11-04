package algorithmAssigment;

import algorithmAssigment.heapsort.HeapSort;
import algorithmAssigment.insertionsort.InsertionSort;
import algorithmAssigment.mergesort.MergeSort;
import algorithmAssigment.quicksort.QuickSort;
import algorithmAssigment.quicksort.version1.SelectPivotMostRight;
import algorithmAssigment.quicksort.version2.SelectPivotRandomNumber;
import algorithmAssigment.quicksort.version3.SelectPivotMedian;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public ArrayList<Integer> deepCopy(ArrayList<Integer>list){
        ArrayList<Integer> newAarray = new ArrayList<>();
        for(Integer i : list){
            newAarray.add(i);
        }
        return newAarray;
    }
    public static void main(String[]args) throws IOException {

//        SortMethod sortMethod = new InsertionSort();
//        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(5,6,2,8,2,3));
//        sortMethod.Sort(list);
//        sortMethod = new MergeSort();
//        sortMethod.Sort(list);
//        System.out.println(list);
//        sortMethod = new HeapSort();
//        sortMethod.sort(list);
//        SortMethod sortMethod1;
//        SortMethod sortMethod2;
//        SortMethod sortMethod3;
//        sortMethod1 = new QuickSort(new SelectPivotMedian());
//        sortMethod2 = new QuickSort(new SelectPivotRandomNumber());
//        sortMethod3 = new QuickSort(new SelectPivotMostRight());
//        list = new ArrayList<Integer>(Arrays.asList(5,6,2,8,2,3));
//        sortMethod1.sort(list);
//        System.out.println(list);
//        list = new ArrayList<Integer>(Arrays.asList(5,6,2,8,2,3));
//        sortMethod2.sort(list);
//        System.out.println(list);
//        list = new ArrayList<Integer>(Arrays.asList(5,6,2,8,2,3));
//        sortMethod3.sort(list);
//        System.out.println(list);
//
//        MakeInputFile makeInputFile = new MakeInputFile();
//        makeInputFile.makeRandomArray();

//
//        File sortedByInsertionSort =
//                new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/outputfile/sortedByInsertionSort.txt");
//        File sortedByMergeSort =
//                new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/outputfile/sortedByMergeSort.txt");
//
//        File sortedByQuickSort_SelectPivotMostRight =
//                new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/outputfile/sortedByMQuickSort_SelectPivotMostRight.txt");
//
//        File sortedByQuickSort_SelectPivotMedian =
//                new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/outputfile/sortedByMQuickSort_SelectPivotMedian.txt");
//
//
//        File sortedByQuickSort_SelectPivotMRandomNumber=
//                new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/outputfile/sortedByMQuickSort_SelectPivotRandomNumber.txt");
//
//        File sortedByQuickSort_SelectPivotMyAlgorithm=
//                new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/outputfile/sortedByMQuickSort_SelectPivotMyAlgorithm.txt");
//
//        ReadFileAndConvert readFileAndConvert = new ReadFileAndConvert();
//        File file = new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_32_unsorted.txt");

//        ArrayList<Integer> readList = readFileAndConvert.readFile(file);

        MakeInputFile makeInputFile = new MakeInputFile();
        makeInputFile.makeRandomArray();
//        ReadFileAndConvert readFileAndConvert = new ReadFileAndConvert();
//        ArrayList<Integer> list = readFileAndConvert.readFile(new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_32.txt"));
//        ArrayList<Integer> list2 = readFileAndConvert.readFile(new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_32_sorted.txt"));
//        ArrayList<Integer> list3 = readFileAndConvert.readFile(new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_1024.txt"));
//        ArrayList<Integer> list4 = readFileAndConvert.readFile(new File("/Users/bagjin-eun/Desktop/javaProject/All/Practice/algorithmAssigment/inputfile/inputarray_1024_sorted.txt"));
//
//        ArrayList<Integer> arrayList1;
//        ArrayList<Integer> arrayList2;
//        ArrayList<Integer> arrayList3;
//        ArrayList<Integer> arrayList4;
//
//        ArrayList<Integer> arrayList5;
//        ArrayList<Integer> arrayList6;
//        ArrayList<Integer> arrayList7;
//        ArrayList<Integer> arrayList8;
//
//        ArrayList<Integer> arrayList9;
//        ArrayList<Integer> arrayList10;
//        ArrayList<Integer> arrayList11;
//        ArrayList<Integer> arrayList12;
//
//        ArrayList<Integer> arrayList13;
//        ArrayList<Integer> arrayList14;
//        ArrayList<Integer> arrayList15;
//        ArrayList<Integer> arrayList16;
//
//        ArrayList<Integer> arrayList17;
//        ArrayList<Integer> arrayList18;
//        ArrayList<Integer> arrayList19;
//        ArrayList<Integer> arrayList20;
//
//        ArrayList<Integer> arrayList21;
//        ArrayList<Integer> arrayList22;
//        ArrayList<Integer> arrayList23;
//        ArrayList<Integer> arrayList24;
//
//        ArrayList<Integer> arrayList25;
//        ArrayList<Integer> arrayList26;
//        ArrayList<Integer> arrayList27;
//        ArrayList<Integer> arrayList28;
//        for(inst)

        SortMethod sortByInsertionSort = new InsertionSort();
        SortMethod sortByMergeSort = new MergeSort();
        SortMethod sortByHeapSort = new HeapSort();
        SortMethod sortByQuickSort_MostRight = new QuickSort(new SelectPivotMostRight());
        SortMethod sortByQuickSort_Median = new QuickSort(new SelectPivotMedian());
        SortMethod sortByQuickSort_Random = new QuickSort(new SelectPivotRandomNumber());
        SortMethod sortByQuickSort = new QuickSort(new SelectPivotMostRight());




    }
}
