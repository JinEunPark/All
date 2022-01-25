package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class array_7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        double average[] = new double[C];// 평균을 넘는 학생들의 비울을 저장하는 배열
        StringTokenizer st;

        for (int i = 0; i < C; i++) {

            st = new StringTokenizer(br.readLine());

            int studentNumber = Integer.parseInt(st.nextToken());

            int array[] = new int[studentNumber];

            int sum = 0;

            for (int e = 0; e < studentNumber; e++) {//학생수 많큼 반복을 진행해서 총합을 구함
                array[e] = Integer.parseInt(st.nextToken());
                sum += array[e];
            }

            double averaged = (double) sum / studentNumber;//한줄의 평균

            int overAverageStudent = 0;//평군을 넘는 학생의 수를 저장할 변수를 선언함

            for (int j = 0; j < array.length; j++) {
                if (array[j] > averaged) {
                    overAverageStudent++;
                }
            }
            average[i] = (double) overAverageStudent / studentNumber;
        }
        for (int i = 0; i < C; i++) {
            System.out.println(String.format("%.3f", average[i]*100)+"%");
        }

    }
}