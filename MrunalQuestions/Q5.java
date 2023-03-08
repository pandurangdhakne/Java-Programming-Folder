/*
 
  input :  num = [3,2,2,3] ; val = 3
  output : 2     num=[2,2,_,_]

  explanation :  val compare to each element in the array and match the same 
                 element in array with the val that element must be skip
                 that element and remaining element come to the previous place 
                 and present element count show in the output


 */

import java.util.*;
public class Q5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size ;
        System.out.print("size of array: ");
        size = sc.nextInt();
        int [] arr = new int[size]; 

        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
       

        System.out.print("remaing element stay in the array: " + removeElement(arr, arr.length));

    }

    static int removeElement(int [] arr , int size)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("target : " );
        int target = sc.nextInt();

        int count=0;

        for(int i=0 ; i<size ; i++)
        {

            if(arr[i] != target)
            {
                arr[count] = arr[i];
                count++;
            }

        }

        return count;

    }

}
