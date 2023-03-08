
/**

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


 */

import java.util.*;

public class TwoSum {

   public static void main(String[] args) {

      int[] arr = { 2, 7, 11, 15 };

      int target = 9;

      Arrays.sort(arr);

      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }

      System.out.println("\n");

      if (arr[arr.length - 1] > target) {
         for (int i = arr.length - 1; i >= 1; i--) {

            if ((arr[0] + arr[i]) == target) {

               System.out.print("Elements are : " + arr[0] + "  " + arr[i]);

            }
            System.out.println();

         }
      }

      else {

         for (int i = 0; i < arr.length - 1; i++) {

            if ((arr[arr.length - 1] + arr[i]) == target) {

               System.out.print("Elements are : " + arr[arr.length - 1] + "  " + arr[i]);

            }
            System.out.println();

         }

      }

   }

}