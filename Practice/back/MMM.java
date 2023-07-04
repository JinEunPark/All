package back;

import java.util.HashSet;
import java.util.Set;

public class MMM {
    public static class SSS{
        String s;
        public SSS(String s){
            this.s = s;
        }
    }
    public static void main(String[] args) {
        Set<Set<String>> ss = new HashSet<>();
        HashSet<String> s = new HashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");

        HashSet<String> s2 = new HashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");

        ss.add(s);
        System.out.println(ss.containsAll(s2)?"true":"false");


        Set<Set<SSS>> s4 = new HashSet<>();
        HashSet<SSS> s5 = new HashSet<>();
        s5.add(new SSS("a"));
        s5.add(new SSS("a"));
        s5.add(new SSS("a"));

        HashSet<SSS> s6 = new HashSet<>();
        s6.add(new SSS("a"));
        s6.add(new SSS("a"));
        s6.add(new SSS("a"));

        s4.add(s5);
        System.out.println(s4.containsAll(s6)?"true":"false");

    }
}
