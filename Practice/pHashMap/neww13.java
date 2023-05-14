package pHashMap;

public class neww13 {

    class Solution{
        public static int[] solution(long n) {
            int size = (int) Math.log10(n) + 1;//자릿수를 한번에 계산하는 방법
            int[] answer = new int[size];

            for (int i = 0; i < size; i++) {
                answer[i] = (int) (n % 10);
                n /= 10;
            }

            return answer;
        }
    }
}
