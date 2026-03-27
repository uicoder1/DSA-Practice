import java.util.*;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), candidates, target, 0);

        return result;
    }

    private static void backtrack(List<List<Integer>> result,
                                  List<Integer> temp,
                                  int[] candidates,
                                  int target,
                                  int start) {

        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0) return;

        for (int i = start; i < candidates.length; i++) {

            temp.add(candidates[i]);

            // reuse same element → i
            backtrack(result, temp, candidates, target - candidates[i], i);

            // backtrack
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] candidates1 = {2,3,6,7};
        int target1 = 7;

        int[] candidates2 = {2,3,5};
        int target2 = 8;

        System.out.println("Result 1:");
        printResult(combinationSum(candidates1, target1));

        System.out.println("Result 2:");
        printResult(combinationSum(candidates2, target2));
    }

    // helper to print result
    public static void printResult(List<List<Integer>> result) {
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}