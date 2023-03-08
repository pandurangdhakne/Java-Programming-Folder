 import java.lang.*;
import java.util.*;


public class MohitEq1 {
    
    public static void main(String[] args) {
        
      int [] arr  = {15,3,2,1,6,5,21,8,10,19};


      Arrays.sort(arr);

      for(int i=0 ; i<arr.length ; i++)
      {
        System.out.print(arr[i] + " ");
      }


      System.out.println("\n");


      if(arr[arr.length - 1] > 20)
      {
        for(int i=arr.length - 1 ; i>=1 ; i--)
        {
           
           if((arr[0] + arr[i]) == 20)
           {
            
              System.out.print("Elements are : " + arr[0] + "  " + arr[i]);

           } 
           System.out.println();


        }
      }
      
      else
      {
            
        for(int i=0 ; i<arr.length-1 ; i++)
        {
           
           if((arr[arr.length-1] + arr[i]) == 20)
           {
            
              System.out.print("Elements are : " + arr[arr.length-1] + "  " + arr[i]);

           } 
           System.out.println();


        }



      }

    }

}
