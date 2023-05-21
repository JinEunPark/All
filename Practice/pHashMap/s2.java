package pHashMap;
import java.util.*;
import java.util.stream.Collectors;

public class s2 {
    class Solution {
        public int solution(int[] money) {
            int answer = 0;
           ArrayList<Integer> moneys = new ArrayList<>(Arrays.stream(money).boxed().collect(Collectors.toList()));
           money = moneys.stream().mapToInt(Integer::intValue).toArray();
            return answer;
        }
    }
}
