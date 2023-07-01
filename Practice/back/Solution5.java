package back;
import java.util.*;
import java.util.stream.Collectors;

class Solution5 {
    public static long solution(int n, int[] works) {
        //야근 피로도 = 야근 시작한 시점 + (남은 일의 작업량)**2\
        long answer = 0;
        int sum = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(Arrays.stream(works).boxed().collect(Collectors.toList()));
        sum = pq.stream().mapToInt(i -> i).sum();

        if(n > sum){
            return 0;
        }

        while(n != 0){
            int a = pq.poll();
            a--;
            n--;
            pq.add(a);
        }

        answer = pq.stream().mapToLong(i->i*i).sum();
        return answer;
    }

    public static void main(String[] args) {
        solution(4,new int[]{4,3,3,});
    }
}