package back;

import java.util.*;
import java.util.stream.*;
class Solution1 {
//     static ArrayList<Integer> list = new ArrayList<>();
//     public void dfs(int[] A, int[] B, int[] newArray, int index){
//         for(int i = 0; i< B.length; i++){
//             if()
//         }
//     }

    public int solution(int[] A, int[] B) {
        int answer = -1;
        List<Integer> A2 = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> B2 = Arrays.stream(A).boxed().collect(Collectors.toList());


        Collections.sort(B2, Collections.reverseOrder());
        Collections.sort(A2);
        for(int i = 0; i < A.length; i++){
            if(B[i]>A[i]){
                answer++;
            }
        }


        return answer+1;
    }
}