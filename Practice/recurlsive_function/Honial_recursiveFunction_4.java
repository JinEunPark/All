package recurlsive_function;

import java.io.*;

public class Honial_recursiveFunction_4 {
    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        getHanoi(n, 1, 3, 2);
        sb.insert(0,count+"\n");
        bw.write(sb.toString());
        bw.close();

    }

    public static void getHanoi (int n, int from, int to, int via) throws IOException {

        if (n == 1) {
            move(1, from, to);
            return;
        } else {
            getHanoi(n - 1, from, via, to);
            move(n, from, to);
            getHanoi(n - 1, via, to, from);
        }
    }

    public static void move(int n, int start, int to) throws IOException{
        ++count;
        sb.append(start + " " + to+"\n");
    }
}
