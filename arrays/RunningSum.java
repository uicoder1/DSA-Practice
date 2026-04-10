public class RunningSum {

    public static int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,1,1,1,1};
        int[] nums3 = {3,1,2,10,1};

        System.out.print("Result 1: ");
        printArray(runningSum(nums1));

        System.out.print("Result 2: ");
        printArray(runningSum(nums2));

        System.out.print("Result 3: ");
        printArray(runningSum(nums3));
    }
}