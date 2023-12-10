import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < number.length() - k; i++){
            int cur = number.charAt(i) - '0';
            int y = i;
            int z = k;
            for(int j = 1; j <= k; j++){
                int index = i + j;
                int x = number.charAt(index) - '0';
                if(cur < x){
                    cur = x;
                    y = index;
                    z = k - j;
                }
            }
            i = y;
            k = z;
            sb.append(cur);
        }

        return sb.toString();
    }
}