package back;

public class Solution11 {
    public boolean check(String s, int N, int[] visited){
        for(int i = 0; i< s.length(); i++){
            int a = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(1<= a && a<= N){
                if(visited[a] == 0){
                    visited[a]  = 1;
                }else{
                    return false;
                }
            }else{
                return false;
            }

        }
        return true;
    }
    public int solution(String s, int N) {
        int answer = -1;
        for(int i = 0; i< s.length()-N+1; i++){
            String tmp = s.substring(i,i+N);
            int t = Integer.parseInt(tmp);
            if(check(tmp,N,new int[N]) && answer < t){
                answer = t;
            }
        }
        return answer;
    }
}
