package pHashMap;

public class Solution {
    public String solution(String s, int n) {
        char[] charlist = new char[s.length()];//자바에서는 함수로 존재함
        int a = (int)'a';
        int A = (int)'A';
        s.
        for(int i =0; i < charlist.length; i++){
            int at = s.charAt(i);
            if(at >97){
                charlist[i] =  (char)((at+n)%123) ;
            }
        }

        String answer = String.valueOf(charlist);
        return answer;
    }

}
