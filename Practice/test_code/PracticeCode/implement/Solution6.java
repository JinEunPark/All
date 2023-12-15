
import java.util.StringTokenizer;
class Solution6 {
    public boolean isPrime(long num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if ((num % i) == 0) return false;
        }
        return true;
    }

    public int solution(int n, int k) {
        int answer = 0;
        String kNum = Integer.toString(n, k);
        StringTokenizer st = new StringTokenizer(kNum, "0");
        while (st.hasMoreTokens()) {
            String o = st.nextToken();
            long num = Long.parseLong(o);
            if (isPrime(num)) answer++;
        }
        return answer;
    }
}