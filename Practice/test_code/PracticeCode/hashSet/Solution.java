package test_code.PracticeCode.hashSet;

import java.util.*;
//구현문제
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];
        Map<String,Integer> email = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            email.putIfAbsent(id_list[i],i);
        }
        Map<String , Set<String>> reportSet = new HashMap<>();

        for(String p: report){
            StringTokenizer st = new StringTokenizer(p);
            String doing = st.nextToken();
            String reported = st.nextToken();
            reportSet.putIfAbsent(reported,new HashSet<>() );
            reportSet.get(reported).add(doing);
        }

        for(Map.Entry<String, Set<String>> entry: reportSet.entrySet()){
            if(entry.getValue().size() >= k){
                for(String doing : entry.getValue()){
                    int index = email.get(doing);
                    answer[index]++;
                }
            }
        }
        return answer;
    }
}
