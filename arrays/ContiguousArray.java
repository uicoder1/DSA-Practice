import java.util.*;

public class ContiguousArray {

    public static int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1); // important base case

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }

            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLen = Math.max(maxLen, length);
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums1 = {0, 1};
        int[] nums2 = {0, 1, 0};
        int[] nums3 = {0,1,1,1,1,1,0,0,0};

        System.out.println("Result 1: " + findMaxLength(nums1)); // 2
        System.out.println("Result 2: " + findMaxLength(nums2)); // 2
        System.out.println("Result 3: " + findMaxLength(nums3)); // 6
    }
}