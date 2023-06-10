package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main3 {
    static int time = 0;

    public static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return x + " " + y;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Point)) return false;

            Point p = (Point) o;
            if (p.x == this.x && p.y == this.y) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            return this.x * 100 + this.y;
        }
    }

    public static boolean checkPoint(Point next, int boxSize, Deque<Point> sneak){

        if (next.x > (boxSize - 1) || next.x < 0 || next.y > (boxSize - 1) || next.y < 0|| sneak.contains(next)){
            return false;
        }else{
            return true;
        }
    }

    public static void move(Deque<Point> sneak, Point next) {
        sneak.pollLast();
        sneak.offerFirst(next);
    }

    public static void getApple(Deque<Point> sneak, Point next, int[][] box) {
        sneak.offerFirst(next);
        box[next.x][next.y] = 0;
    }


    public static void main(String[] args) throws IOException {
        int boxSize;
        int appleNum;
        int changDirectionNum;
        Deque<Point> sneak = new ArrayDeque<>();
        sneak.offerFirst(new Point(0, 0));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boxSize = Integer.parseInt(br.readLine());
        int[][] box = new int[boxSize][boxSize];
        appleNum = Integer.parseInt(br.readLine());

        int i = 0;

        while (i < appleNum) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            i++;
            box[x - 1][y - 1] = 1;
        }
        changDirectionNum = Integer.parseInt(br.readLine());
        Map<Integer, String> change = new HashMap<>();
        int j = 0;
        while (j < changDirectionNum) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            int moment = Integer.parseInt(st.nextToken());
            String direct = st.nextToken();

            change.put(moment, direct);
            j++;
        }
        int status = 0;
        int[][] ch = {{0, 1},{1, 0}, {0, -1}, {-1, 0}};

        while (true) {
            time++;
            Point current = sneak.peekFirst();
            Point next;

            next = getPoint(status, ch, current);
            if(checkPoint(next,boxSize,sneak)){
                if (box[next.x][next.y] == 1) {
                    getApple(sneak, next, box);
                } else {
                    move(sneak, next);
                }
            }else{
                break;
            }

            status = getStatus(change, status);
        }

        System.out.println(time);

    }

    private static int getStatus(Map<Integer, String> change, int status) {
        if (change.get(time) != null) {
            String d = change.get(time);
            if (d.equals("D")) {
                status += 1;
                status = status %4;
            } else {
                status += 3;
                status = status %4;
            }
        }
        return status;
    }

    private static Point getPoint(int status, int[][] ch, Point current) {
        Point next = new Point(current.x + ch[status][0], current.y + ch[status][1]);
        return next;
    }
}
