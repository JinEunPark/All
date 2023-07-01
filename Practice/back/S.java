package back;

public class S {

        public int solution(int n, int[] stations, int w) {
            int answer = 0;
            int mod = w * 2 + 1;

            int index = 1;
            if (w == 0) {
                return (n + mod - 1) / mod;
            }

            for (int i = 0; i < stations.length; i++) {
                if (stations[i] - w > index) {//이게 관건이네
                    int result = (stations[i] - w) - index;
                    answer += (int) Math.ceil((double) result / mod);
                }
                index = stations[i] + w + 1;
            }

            if (n >= index) {
                int result = n - index + 1;
                answer += (int) Math.ceil((double) result / mod);
            }

            return answer;
        }


}
