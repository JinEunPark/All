package back;

import java.util.*;

public class Solutions {
    public static boolean cp(String input){
        return input.matches(".*p.*r.*o.*g.*r.*a.*m.*m.*e.*r.*");
    }
    public static int programmerStrings(String s) {
        // Write your code here
        if(s.length() == 20){
            return 0;
        }

        int lindex = 0;
        int rindex = 0;
        for(int i = 0; i< s.length(); i++){
            String lString = s.substring(0,i+11);
            if(cp(lString)){
                lindex = i+10;
                break;
            }
        }

        for(int j = s.length()-11; j>=0; j--){
            String rString = s.substring(j,s.length());
            if(cp(rString)){
                rindex = j;
                break;
            }
        }

        return rindex - lindex;

    }
}
