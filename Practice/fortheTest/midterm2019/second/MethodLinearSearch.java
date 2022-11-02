package fortheTest.midterm2019.second;

public class MethodLinearSearch implements SearchMethod {

    @Override
    public boolean search(int[] objs, int num) {

        for (int n : objs) {
            if (num == n) return true;
        }
        return false;
    }
}
