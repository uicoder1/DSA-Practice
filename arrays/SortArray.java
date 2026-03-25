public class SortArray {

    public static void mergeSort(int[] nums, int left, int right) {

        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    public static void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];

        for (int p = 0; p < temp.length; p++) {
            nums[left + p] = temp[p];
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {5,2,3,1};
        int[] nums2 = {5,1,1,2,0,0};

        System.out.print("Before: ");
        printArray(nums1);

        mergeSort(nums1, 0, nums1.length - 1);

        System.out.print("After: ");
        printArray(nums1);

        System.out.print("Before: ");
        printArray(nums2);

        mergeSort(nums2, 0, nums2.length - 1);

        System.out.print("After: ");
        printArray(nums2);
    }
}