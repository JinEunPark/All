package back;
import java.util.ArrayList;
import java.util.List;

public class CombinationExample {
    public static List<List<Integer>> combinations(int n, int m) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        generateCombinations(n, m, 1, combination, result);

        return result;
    }

    private static void generateCombinations(int n, int m, int start, List<Integer> combination, List<List<Integer>> result) {
        if (m == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i <= n; i++) {
            combination.add(i);
            generateCombinations(n, m - 1, i + 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 3;

        List<List<Integer>> combinations = combinations(n, m);

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
