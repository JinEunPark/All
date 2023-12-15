package test_code.PracticeCode.implement;

import java.util.*;

class Solution {

    public int cal(String h, String m) {

        int h1 = Integer.parseInt(h);
        h1 = h1 * 60;
        int m1 = Integer.parseInt(m);

        return h1 + m1;
    }

    public int getFee(String in, String out, int initT, int initM, int extT, int extM) {
        int fee = initM;

        StringTokenizer st1 = new StringTokenizer(in, ":");
        StringTokenizer st2 = new StringTokenizer(out, ":");

        int inTime = cal(st1.nextToken(), st1.nextToken());
        int outTime = cal(st2.nextToken(), st2.nextToken());

        int total = outTime - inTime;

        if (total - initT > 0) {
            int rest = total - initT;
            int v = (rest / extT);
            if ((rest % extT) != 0) v++;
            fee += v * extM;
        }

        return fee;
    }

    public class Car {
        String in;
        String out = "23:59";
        int time;
        int fee;
        String num;

        public Car(String num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "in='" + in + '\'' +
                    ", out='" + out + '\'' +
                    ", time=" + time +
                    ", fee=" + fee +
                    ", num='" + num + '\'' +
                    '}';
        }
    }

    public int[] solution(int[] fees, String[] records) {

        PriorityQueue<Car> pq = new PriorityQueue<>((i, j) -> Integer.compare(Integer.parseInt(i.num), Integer.parseInt(j.num)));

        Map<String, List<Car>> carMap = new HashMap<>();
        for (String record : records) {
            String[] info = record.split(" ");
            if (carMap.containsKey(info[1])) {
                List<Car> c = carMap.get(info[1]);

                if (info[2].equals("OUT")) {
                    Car car = c.get(c.size() - 1);
                    car.out = info[0];
                } else {
                    Car c2 = new Car(info[1]);
                    c2.in = info[0];
                    c.add(c2);
                }
            } else {
                Car c = new Car(info[1]);

                c.in = info[0];
                List<Car> cars = new ArrayList<>() {{
                    add(c);
                }};

                carMap.put(info[1], cars);

            }
        }

        for (Map.Entry<String, List<Car>> entry : carMap.entrySet()) {
            List<Car> cars = entry.getValue();
            int t = 0;
            for (int i = 0; i < cars.size(); i++) {
                Car c = cars.get(i);

                StringTokenizer st1 = new StringTokenizer(c.in, ":");
                StringTokenizer st2 = new StringTokenizer(c.out, ":");

                int inTime = cal(st1.nextToken(), st1.nextToken());
                int outTime = cal(st2.nextToken(), st2.nextToken());

                t += outTime - inTime;
            }
            cars.get(cars.size() - 1).time = t;
        }

        carMap.values().stream().forEach(i -> {
            pq.add(i.get(i.size() - 1));
        });
        System.out.println(carMap);
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            Car i = pq.poll();

            result.add(getFee(i.in, i.out, fees[0], fees[1], fees[2], fees[3]));
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
