package pHashMap;
import java.util.*;
import java.util.*;
import java.util.*;

class Solution {
    public static class PriorityIndex implements Comparable<PriorityIndex> {
        int index;
        int priority;

        PriorityIndex(int index, int priority){
            this.index = index;
            this.priority = priority;
        }


        public String toString(){
            return "index: "+ index +" priority: "+ priority;
        }

        @Override
        public int compareTo(PriorityIndex o) {
            return this.priority - o.priority;
        }
    }

    public static int findMax(Deque<PriorityIndex> pi){
        int max = -1;
        for(PriorityIndex i: pi){
            if(i.priority > max){
                max = i.priority;
            }
        }

        return max;
    }
    public static int solution(int[] priorities, int location) {

        Deque<PriorityIndex> pi = new ArrayDeque<PriorityIndex>();

        for(int i = priorities.length-1; i>=0; i--){
            pi.add(new PriorityIndex(i, priorities[i]));
        }

        PriorityIndex p = pi.peek();

        int max = findMax(pi);
        int i = 0;

        while(p.index != location){

            p = pi.peek();
            if(p.priority < max){
                pi.poll();
                pi.add(p);
                max = findMax(pi);
                Collections.sort(pi, new Comparator(){
                    @Override
                    public int compare(Object o1, Object o2) {

                        PriorityIndex p =  (PriorityIndex)o1;
                        PriorityIndex p2 =  (PriorityIndex)o2;
                        return p.index - p2.index;
                    }

                });

            }else{

                i++;
                max = findMax(pi);
                pi.poll();
            }


        }


        return i;
    }

    public static void main(String []args){
        int[] a = {2, 1, 3, 2};
        int b = 2;
        System.out.println(solution(a,b));
    }
}