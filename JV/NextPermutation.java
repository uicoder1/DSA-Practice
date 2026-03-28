import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        // Step 1: find break point
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: swap with next greater element
        if (i >= 0) {
            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        // Step 3: reverse right part
        reverse(nums, i + 1, nums.length - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,3};
        int[] nums2 = {3,2,1};
        int[] nums3 = {1,1,5};

        System.out.print("Before: ");
        printArray(nums1);
        nextPermutation(nums1);
        System.out.print("After: ");
        printArray(nums1);

        System.out.print("\nBefore: ");
        printArray(nums2);
        nextPermutation(nums2);
        System.out.print("After: ");
        printArray(nums2);

        System.out.print("\nBefore: ");
        printArray(nums3);
        nextPermutation(nums3);
        System.out.print("After: ");
        printArray(nums3);
    }
}