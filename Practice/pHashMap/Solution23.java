package pHashMap;

import java.util.ArrayList;
import java.util.List;

public class Solution23 {

    public int subList(ArrayList<Integer> arr, int[] command){
        List<Integer> newArr = arr.subList(command[0] ,command[1]+1);
        newArr.sort(Integer::compare);
        return newArr.indexOf(command[3]);
    }

    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i< array.length; i++){
            arr.add(array[i]);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<commands.length; i++){
            answer.add(subList(arr,commands[i]));
        }



        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}


