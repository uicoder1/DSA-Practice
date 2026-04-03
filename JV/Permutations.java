import java.util.*;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), nums);

        return result;
    }

    private static void backtrack(List<List<Integer>> result,
                                  List<Integer> temp,
                                  int[] nums) {

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (temp.contains(nums[i])) continue;

            temp.add(nums[i]);

            backtrack(result, temp, nums);

            temp.remove(temp.size() - 1); // backtrack
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        List<List<Integer>> result = permute(nums);

        System.out.println("Permutations:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}