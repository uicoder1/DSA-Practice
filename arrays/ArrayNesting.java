import java.util.*;

public class ArrayNesting {

    public static int arrayNesting(int[] nums) {

        boolean[] visited = new boolean[nums.length];
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!visited[i]) {

                int count = 0;
                int j = i;

                while (!visited[j]) {
                    visited[j] = true;
                    j = nums[j];
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums1 = {5,4,0,3,1,6,2};
        int[] nums2 = {0,1,2};

        System.out.println("Result 1: " + arrayNesting(nums1)); // 4
        System.out.println("Result 2: " + arrayNesting(nums2)); // 1
    }
}