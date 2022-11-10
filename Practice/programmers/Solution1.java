package programmers;

public class Solution1 {
    public static int solution(String[] babbling) {
        String[] capability = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            String mid = babbling[i];
            for (int j = 0; j < capability.length; j++) {
                if (mid.contains(capability[j])) {
                    mid = mid.replace(capability[j], "-");
                }
            }
            mid = mid.replaceAll("-","");
            if (mid.length() == 0) {
                answer++;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        String[] b = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        String[]a = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(a));
        System.out.println("".length());

    }
}
