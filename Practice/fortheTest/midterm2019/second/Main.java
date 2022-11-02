package fortheTest.midterm2019.second;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        final int MIN = 11;
        final int MAX = 110;
        final int NUMS = 50;
        IntArrays intArrays = new IntArrays(MIN, MAX, NUMS);


        Search search = new Search(new MethodLinearSearch());
        int[] randints = intArrays.getNumbers();
        System.out.println(search.searching(randints, randints[NUMS - 10]));
        System.out.println(search.searching(randints, randints[NUMS - 20]));
        System.out.println(search.searching(randints, MAX + 10));
        System.out.println(search.searching(randints, MIN - 10));
        search.setSearchMethod(new MethodBinarySearch());
        System.out.println(search.searching(randints, randints[NUMS - 10]));
        System.out.println(search.searching(randints, randints[NUMS - 20]));
        System.out.println(search.searching(randints, MAX + 10));
        System.out.println(search.searching(randints, MIN - 10));
    }


}
