package programmers;

import java.util.ArrayList;

public class Solution2 {
    public static int check(int stack[], int size, int answer){

        int count =0;
        for(int i = 1;i<size; i++){
            while((stack[i] == stack[i - 1] || stack[i] == stack[i + 1]) && (stack[i] != 0)){
                count++;
                i++;
            }

            for(int e = i; e<size;e++){
                stack[e-count] = stack[e];
            }
            answer += count;
            size = size-count;
            if(count != 0 && size >0){
                answer +=check(stack,size,answer);
            }

            count = 0;
        }
        return answer;
    }

    public static void printArray(int array[]){
        System.out.printf("[");
        for(int i = 0; i< array.length; i++){
            System.out.printf(" %d",array[i]);
        }
        System.out.printf("]");
    }
    public static int solution(int[][] board, int[] moves) {

            int answer = 0;
            ArrayList<Integer> stack = new ArrayList<>();

            for (int i = 0; i < moves.length; i++) {
                for (int j = 0; j < board.length; j++) {

                    if (board[j][moves[i] - 1] != 0) {
                        stack.add(board[j][moves[i] - 1]);
                        board[j][moves[i] - 1] = 0;

                        break;
                    }
                }
            }
            for(int i = 0; i< stack.size(); i++){

                if(i !=(stack.size()-1)){

                    if(stack.get(i)==stack.get(i+1)){
                        stack.remove(i);
                        stack.remove(i);
                        answer++;
                        i=-1;
                    }

                }
            }
        System.out.println(answer);
            return answer*2;


    }


    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int moves[] = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(board[1][2]);

        System.out.println(solution(board, moves));

    }


}
