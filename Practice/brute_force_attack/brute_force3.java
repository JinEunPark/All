package brute_force_attack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class brute_force3 {

    static ArrayList<Integer> weight_array = new ArrayList<>();
    static ArrayList<Integer> height_array = new ArrayList<>();

    public static void main(String[] args) throws IOException {




        StringTokenizer st;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());

            weight_array.add(Integer.parseInt(st.nextToken()));
            height_array.add(Integer.parseInt(st.nextToken()));

        }

        int [] rank = new int [weight_array.size()];

        for(int i = 0; i< weight_array.size(); i++){
            rank[i] = 1;
        }

        dongchi(weight_array, height_array, rank);

        for (int i = 0; i < N; i++) {

            System.out.println(rank[i]);
        }

    }

    public static void dongchi(ArrayList<Integer> array_weight, ArrayList<Integer> height_array, int rank[]) {

        for (int i = 0; i < array_weight.size(); i++) {
            for (int j = 0; j < array_weight.size(); j++) {
                if (array_weight.get(i) < array_weight.get(j) && height_array.get(i) < height_array.get(j)) {
                    ++rank[i];
                }
            }
        }
    }
}
