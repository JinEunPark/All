package back;

import java.util.*;
import java.util.stream.*;

class Solution {
    Set<Set<String>> com = new HashSet<>();

    public boolean check(String user_id, String banned_id){
        if(user_id.length() == banned_id.length()){
            int index = 0;
            while(index < banned_id.length()
                    &&(user_id.charAt(index) == banned_id.charAt(index)
                    ||banned_id.charAt(index) == '*')){

                index++;
            }

            if(index == user_id.length())return true;

            return false;
        }else{
            return false;
        }
    }

    public void getCom(boolean[]selected, String[] user_id, String[] banned_id, int index, Set<String> result){
        if(index == banned_id.length){
            com.add(result);
            return;
        }

        for(int i = 0; i < user_id.length; i++){
            if(!selected[i]&&check(user_id[i], banned_id[index])){
                boolean[] boll = selected.clone();
                boll[i] = true;
                Set<String> result2 = new HashSet<>(result);
                result2.add(user_id[i]);
                int tmp = index;
                tmp++;
                getCom(boll, user_id, banned_id,tmp ,result2);
            }

        }

    }

    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        boolean[] selected = new boolean[user_id.length];

        for(int j = 0; j < banned_id.length; j++){
            getCom(selected,user_id,banned_id,0,new HashSet<>());
        }

        return com.size();
    }
}
