package test_code.PracticeCode.dfs;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public class Row {
        int[] target = new int[11];
        int index = 0;
        int rest = 0;
        int sum = 0;

        public Row(int index, int rest, int[] target) {
            this.index = index;
            this.rest = rest;
            this.target = target;
        }
    }

    public boolean isWin(Row r, int[] info) {
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < info.length; i++) {
            if (r.target[i] > info[i]) {
                sum += (10 - i);
            } else if(r.target[i] != 0 || info[i]!= 0){
                sum2 += (10 - i);
            }
        }

        if (sum > sum2) {
            r.sum = sum - sum2;
            return true;
        }
        return false;
    }


    public int[] solution(int n, int[] info) {
        List<Row> result = new ArrayList<>();

        int[] answer = {-1};
        Stack<Row> st = new Stack<>();
        st.add(new Row(0, n, new int[11]));

        while (!st.isEmpty()) {
            Row cur = st.pop();
            if (cur.index == 11) {
                if (cur.rest == 0 && isWin(cur, info)) {
                    result.add(cur);
                }
                continue;
            }

            if (cur.index == 10) {
                int[] nt = cur.target.clone();
                nt[cur.index] = cur.rest;

                st.push(new Row(cur.index+1, 0, nt));

            } else {
                if (cur.rest > info[cur.index]) {
                    Row nr = new Row(cur.index + 1, cur.rest - info[cur.index] - 1, cur.target.clone());
                    nr.target[cur.index] = info[cur.index] + 1;
                    st.push(nr);
                    Row nr2 = new Row(cur.index + 1, cur.rest, cur.target.clone());
                    st.push(nr2);
                } else {
                    Row nr2 = new Row(cur.index + 1, cur.rest, cur.target.clone());
                    st.push(nr2);
                }
            }

        }

        if (result.size() == 0) {
            return answer;
        }

        int max = result.stream().mapToInt(i -> i.sum).max().getAsInt();
        result = result.stream().filter(i -> i.sum == max).collect(Collectors.toList());

        Collections.sort(result, (i, j) -> {
            int index = i.target.length - 1;
            for (int k = i.target.length-1; k >= 0; k--) {
                if(i.target[k] == j.target[k]) continue;
                return i.target[k] > j.target[k]? 1:-1;
            }
            return 0;
        });

        return result.get(result.size() - 1).target;
    }
}