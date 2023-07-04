package back;

import java.util.*;

class Solution6 {
    public double[] getPair(int[] f1, int[] f2){
        double[] value = new double[2];
        long a = f1[0],b = f1[1],c = f2[0],d = f2[1],e = f1[2],f = f2[2];
        value[0] = (double)(b*f - e*d) / (a*d - b*c);
        value[1] = (double)(e*c - a*f) / (a*d - b*c);
        return value;
    }

    public int[] getMax(Set<ArrayList<Integer>> pairs){
        int x = -100001,y = -100001;
        int[] result = new int[2];

        for(ArrayList<Integer> a: pairs){
            int x1 = a.get(0);
            int y1 = a.get(1);
            if(x1 > x){
                x = x1;
            }

            if(y1 > y){
                y = y1;
            }
        }
        result[0] = x;
        result[1] = y;
        return result;

    }
    public int[] getMin(Set<ArrayList<Integer>> pairs){
        int x = 100001,y = 100001;
        int[] result = new int[2];

        for(ArrayList<Integer> a: pairs){
            int x1 = a.get(0);
            int y1 = a.get(1);
            if(x1 < x){
                x = x1;
            }

            if(y1 < y){
                y = y1;
            }
        }
        result[0] = x;
        result[1] = y;
        return result;
    }

    public int[] transiton(ArrayList<Integer> pair, int[] lt){
        int minx = lt[0];
        int maxy = lt[1];
        int[] rela = {maxy - pair.get(1),pair.get(0) - lt[0]};//배열 좌표로 변환
        return rela;
    }
    public String[] solution(int[][] line) {
        String[] answer;
        Set<ArrayList<Integer>> map = new HashSet<>();
        for(int i =0; i< line.length; i++){
            for(int j =0; j< line.length; j++){
                double[] pair = getPair(line[i],line[j]);
                double rest = pair[0] % 1.0;
                double rest2 = pair[1] % 1.0;
                if(rest==0 && rest2 == 0){
                    ArrayList<Integer> buf = new ArrayList<>();
                    buf.add((int)(pair[0]/1));
                    buf.add((int)(pair[1]/1));
                    map.add(buf);
                }
            }
        }

        // System.out.println(map);
        int[] max = getMax(map);
        int[] min = getMin(map);
        int h = max[0] - (min[0] -1);
        int v = max[1] - (min[1] -1);
        int[] lt = {min[0], max[1]};


        answer = new String[v];
        char[][] stars = new char[v][h];
        for(char[] s: stars){
            for(int i = 0; i<s.length; i++){
                s[i] = '.';
            }
        }

        for(ArrayList<Integer> m: map){
            int[] coordinate = transiton(m,lt);
            stars[coordinate[0]][coordinate[1]] = '*';
        }

        for(int i = 0; i< stars.length; i++){
            answer[i] =  new String(stars[i]);
        }

        return answer;
    }
}
