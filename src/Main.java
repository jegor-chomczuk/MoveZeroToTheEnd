/*
Given an int[] nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Outpt: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Outpt: [0]
*/


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Example input
        int[] nums1 = {0, 1, 0, 3, 12};
        int[] nums2 = {0};

        //Print to console example array for easy comparison
        System.out.println("Num1 array: \n" + Arrays.toString(nums1) + "\n\nNum1 array with zroes moved to the end:");

        //Example usage ot the method pushing zeroes to the end of an array
        moveZeroToTheEnd(nums1);
    }

    //Method pushing zeroes to the end of an array
    public static void moveZeroToTheEnd(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }

        while (count < nums.length) {
            nums[count++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
