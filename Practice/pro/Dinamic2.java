//package pro;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Dinamic2 {
//    static class Solution {
//        public boolean check(Queue<Character> q){
//            Queue<Integer> q = new LinkedList<>(Arrays.stream(prices).collect(Collectors.toList()));
//
//            Queue<Character> q2 = new LinkedList<>();
//            Stack<Character> st = new Stack<>();
//            while(!q.isEmpty()){
//                char c = q.poll();
//                q2.add(c);
//
//                if(st.isEmpty() && "]})".contains(String.valueOf(c))){
//                    return false;
//                }else if("[{(".contains(String.valueOf(c))){
//                    st.push(c);
//                }else{
//                    char top = st.peek();
//                    if(top == '[' && c == ']') {
//                        st.pop();
//                    }else if(top == '{' && c == '}'){
//                        st.pop();
//                    }else if(top == '(' && c == ')'){
//                        st.pop();
//                    }
//                }
//            }
//            q = q2;
//            return st.isEmpty()? true : false;
//        }
////        public boolean check(Queue<Character> q){
////
////        Stack<Character> st = new Stack<>();
////        while(!q.isEmpty()){
////            char c = q.poll();
////            if(st.isEmpty());
////        }
////
////        return false;
////    }
//        public int calculate(String head, String body, String sub) {
//            int h = Integer.valueOf(head);
//            int s = Integer.valueOf(sub);
//            int result = 0;
//            if (body.equals("+")) {
//                result = h + s;
//            }
//            if (body.equals("-")) {
//                result = h - s;
//            }
//            return result;
//        }
//
//        public int solution(String arr[]) {
//            int l = arr.length;
//
//            int answer = -1;
//
//            int[][] maxMemo = new int[l][l];
//            int[][] minMemo = new int[l][l];
//            for (int i = 0; i < maxMemo.length; i++) {
//                Arrays.fill(maxMemo[i], Integer.MIN_VALUE);
//                Arrays.fill(minMemo[i], Integer.MAX_VALUE);
//
//            }
//
//            for (int i = 0; i < arr.length; i += 2) {
//                maxMemo[i][i] = Integer.parseInt(arr[i]);
//                minMemo[i][i] = Integer.parseInt(arr[i]);
//            }
//
//            for (int i = 0; i < arr.length - 2; i += 2) {
//                maxMemo[i][i + 2] = calculate(arr[i], arr[i + 1], arr[i + 2]);
//                minMemo[i][i + 2] = calculate(arr[i], arr[i + 1], arr[i + 2]);
//            }
//
//            for (int j = 3; j < arr.length + 1; j += 2) {//dnls
//                int window = j;
//                for (int i = 0; i <= arr.length - window; i += 2) {
//                    for (int k = i + 1; k < i + window; k += 2) {
//
//                        String operator = arr[k];
//                        if (operator.equals("+")) {
//                            if (maxMemo[i][i + window - 1] < maxMemo[i][k - 1] + maxMemo[k + 1][i + window - 1])
//                                maxMemo[i][i + window - 1] = maxMemo[i][k - 1] + maxMemo[k + 1][i + window - 1];
//
//
//                            if (minMemo[i][i + window - 1] > minMemo[i][k - 1] + minMemo[k + 1][i + window - 1])
//                                minMemo[i][i + window - 1] = minMemo[i][k - 1] + minMemo[k + 1][i + window - 1];
//                        }
//
//                        if (operator.equals("-")) {
//                            if (maxMemo[i][i + window - 1] < maxMemo[i][k - 1] - minMemo[k + 1][i + window - 1])
//                                maxMemo[i][i + window - 1] = maxMemo[i][k - 1] - minMemo[k + 1][i + window - 1];
//                            if (minMemo[i][i + window - 1] > minMemo[i][k - 1] - maxMemo[k + 1][i + window - 1])
//                                minMemo[i][i + window - 1] = minMemo[i][k - 1] - maxMemo[k + 1][i + window - 1];
//
//                        }
//
//                    }
//                }
//            }
//
//            return maxMemo[0][arr.length - 1];
//        }
//    }
//}


