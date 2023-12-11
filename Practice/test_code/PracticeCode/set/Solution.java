
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[][] routes) {
        List<Set<Integer>> setList = new ArrayList<>();
        for (int[] route : routes) {
            Set<Integer> range = new HashSet<>();
            IntStream.rangeClosed(route[0], route[1]).forEach(i -> range.add(i));
            setList.add(range);
        }
        Collections.sort(setList, (i, j) -> {
            return j.size() - i.size();
        });

        List<Set<Integer>> answerList = new ArrayList<>();
        for (int i = 0; i < setList.size(); i++) {
            if (answerList.isEmpty()) {
                answerList.add(setList.get(i));
                continue;
            } else {
                int k = 0;
                int max = 0;

                for (int j = 0; j < answerList.size(); j++) {

                    Set<Integer> parentSet = new HashSet<>(answerList.get(j).stream().collect(Collectors.toList()));
                    Set<Integer> childSet = setList.get(i);
                    System.out.println(parentSet);
                    System.out.println(childSet);
                    parentSet.retainAll(childSet);

                    if(max < parentSet.size()){
                        max = parentSet.size();
                        k = j;
                    }

                }

                if (max != 0) {
                    Set<Integer> parentSet = answerList.get(k);
                    Set<Integer> childSet = setList.get(i);
                    parentSet.retainAll(childSet);
                }else if(max == 0){
                    answerList.add(setList.get(k));
                }
            }
        }

        System.out.println(answerList);
        int answer = answerList.size();
        return answer;
    }
}
