//package arrays;

import java.util.Scanner;

public class zeroAtEnd {

    public static void moveZeroes(int[] nums) {
        int left = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]!=0){
                int t = nums[i];
                nums[i] = nums[left];
                nums[left] = t;
                left++;
            }
    }
}
    public static void main(String[] args) {
        int len ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array = ");
        len = sc.nextInt();

         System.out.print("Enter elements of array = ");
        int arr[] = new int[len];
        for(int i=0 ; i<len ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Input array = ");
        for(int i=0 ; i<len ; i++)
        {
            System.out.print( arr[i] + " ") ;
        }

        moveZeroes(arr);

        System.out.println();
        System.out.print("Output array = ");
        for(int i=0 ; i<len ; i++)
        {
            System.out.print( arr[i] + " ") ;
        }

    }
}