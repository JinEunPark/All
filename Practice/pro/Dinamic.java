package pro;

public class Dinamic {

    static class Solution {

        public Long fibo(int n){
            long f1 = 0;
            long f2 = 1;

            if (n == 0) return f1;
            if (n == 1) return f2;

            for (int i = 2; i <= n; i++){
                long f3 = f1 + f2;
                f1 = f2;
                f2 = f3 % 1234567L; // 이미 초과한 후에 나누기 해도 소용이 ㅇ없다 따라서 연산 때 마다 나워야함
            }
            return f2;
        }

        public int solution(int n) {
            return fibo(n).intValue();
        }
    }

}
