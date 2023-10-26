package pro.q;
import java.util.*;

public class Qeue {

    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;

            Queue<Integer> bridge = new LinkedList<>();// 트럭자체
            Queue<Integer> timesQ = new LinkedList<>();// 나갈시간

            int time = 0;
            int truckIndex = 0;
            int complete = 0;
            int currentWeight = 0;

            while(complete < truck_weights.length){
                time++;

                if(!timesQ.isEmpty() && timesQ.peek() == time){
                    int tindex = bridge.poll();
                    currentWeight -= truck_weights[tindex];
                    timesQ.poll();
                    complete++;
                    if(complete == truck_weights.length){
                        break;
                    }
                }

                if((truckIndex < truck_weights.length)  && (currentWeight + truck_weights[truckIndex]) <= weight){
                    currentWeight = currentWeight + truck_weights[truckIndex];
                    bridge.add(truckIndex);
                    timesQ.add(time + bridge_length);
                    truckIndex++;
                }
            }
            return time;
        }
    }
}
