package back;

class Solution2 {
    public int[] solution(int n, int s) {
        int[] answer = {};

        if(s < n){
            return new int[]{-1};
        }
        answer = new int[n];
        int index = 0;
        while(n > 0){
            int buf = s/n;
            answer[index] = buf;
            n--;
            s -= buf;
            index++;
        }
        return answer;
    }
}
