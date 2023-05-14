package pHashMap;
import java.util.*;
public class s2 {
    class Solution {
        public String solution(String s) {
            StringBuilder answer = new StringBuilder();
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0 && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    answer.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    answer.append(s.charAt(i));
                }
            }
            return answer.toString();
        }
    }
}
