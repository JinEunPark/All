package back;

import java.util.*;
import java.util.function.Consumer;
class Solution {
    public int binarySearch(List<Integer> scores, int score){
        int start = 0;
        int end = scores.size()-1;

        while(end > start){
            int mid = (start+end) /2;
            if(scores.get(mid) >= score){
                end = mid;
            }else{
                start = mid +1 ;
            }
        }
        if(scores.get(start) < score){
            return scores.size();
        }
        return start;
    }
    public int count(Map<String, List<Integer>> scores, String query){
        String[] tokens = query.split(" (and )?");

        String key = String.join("", Arrays.copyOf(tokens, tokens.length-1));//해당 인덱스 하나 전까지 copy

        List<Integer> scorelist = scores.get(key);
        if(scorelist == null)        {
            return 0;
        }else{
            int score = Integer.parseInt(tokens[tokens.length-1]);
            return scorelist.size() - binarySearch(scorelist,score);
        }


    }
    public Map<String, List<Integer>> buildScores(String[] info){
        Map<String, List<Integer>> scoresMap = new HashMap<>();

        for(int i = 0; i< info.length; i++){
            String[] tokens = info[i].split(" ");
            int score = Integer.parseInt(tokens[tokens.length-1]);

            forEachKey(0,"",tokens, e -> {
                scoresMap.putIfAbsent(e, new ArrayList<>());
                scoresMap.get(e).add(score);
            });

        }
        for(List<Integer> scorelist: scoresMap.values()){
            scorelist.sort(Integer::compare);
        }
        return scoresMap;
    }


    public void forEachKey(int index, String prefix, String[] tokens, Consumer<String> action) {
        if (index == tokens.length - 1) {
            action.accept(prefix);
            return;
        }
        forEachKey(index + 1, prefix + tokens[index], tokens, action);
        forEachKey(index + 1, prefix + "-", tokens, action);
    }


    public int[] solution(String[] info, String[] query) {
        Map<String, List<Integer>> scoresMap = buildScores(info);
        int[] answer = new int[query.length];

        for(int i = 0; i< query.length; i++){
            String q = query[i];
            answer[i] = count(scoresMap,q);

        }
        return answer;
    }
}