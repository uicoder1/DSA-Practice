public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void printArray(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {1,1,2};
        int k1 = removeDuplicates(nums1);
        System.out.print("Result 1: ");
        printArray(nums1, k1);

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int k2 = removeDuplicates(nums2);
        System.out.print("Result 2: ");
        printArray(nums2, k2);
    }
}