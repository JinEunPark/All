package pHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class asdfad {


    public static int subList(ArrayList<Integer> arr, int[] command){
        List<Integer> newArr = arr.subList(command[0] -1 ,command[1]).stream().collect(Collectors.toList());

        Collections.sort(newArr);
        return newArr.get(command[2]-1);
    }

    public static int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i< array.length; i++){
            arr.add(array[i]);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<commands.length; i++){
            answer.add(subList(arr,commands[i]));
            System.out.println(arr);
        }



        int[] answer2 = new int[commands.length];
        for(int i = 0; i< answer2.length; i++){
            answer2[i] = answer.get(i);
        }


        return answer2;
    }

    public static void main(String [] args){;
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array,commands)));
    }
}
