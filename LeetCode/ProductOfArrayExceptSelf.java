/*


Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)


*/

import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class ProductOfArrayExceptSelf {
   

    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4};

        for (Integer i : arr) {
            
            System.out.println(i);

        }


        int [] left = new int[arr.length];
        int [] right = new int[arr.length];


        int productLeft = 1;
        for(int i=0 ; i<arr.length ; i++)
        {
            productLeft =  arr[i] * productLeft;
            left[i] = productLeft;
        }

        System.out.println("\n");
/* 

for (int i : left) {
    
    System.out.println(i);
    
}

*/

       int productRight = 1;
       for(int i = arr.length-1 ; i>=0 ; i--)
       {
          productRight = arr[i]*productRight;

          right[i] = productRight;


       }
/*
 
for (int i : right) {
    
    System.out.println(i);
    
}

*/

    int [] out = new int[arr.length];


      for(int i=0 ; i<arr.length ; i++)
      {


        if(i == 0)
        {

           out[i] = right[i+1];

        }
        else if(i == arr.length-1)
        {

            out[i] = left[i-1];

        }
        else
        {

            out[i] = left[i-1] * right[i+1];

        }



      }





      for (int i : out) {
        
        System.out.println(i);

      }










     


    }


}
