import java.util.*;

public class VirtusaQ4 {
 
    public static void main(String[] args) {
        
        /*
        
        8  4

        Input arr:-  3 4 6 7 2 9 8 1
      
        Output arr:- 1 2 3 4 9 8 7 6


        */

         Scanner sc = new Scanner(System.in);

          

         int N = sc.nextInt();

         int K = 2;

         int [] arr = new int[N];

         int [] rev = new int[arr.length - K];

         for(int i=0 ; i<arr.length ; i++)
         {
 
               arr[i] = sc.nextInt();

         }

         Arrays.sort(arr);

         int h = arr.length-1;
         for(int i = arr.length-1 ; i>=K ; i--)
         {

              rev[i-h] = arr[i];
              h-=2;  

         }


         for(int i=0 ; i<rev.length ; i++)
         {
            arr[K + i] = rev[i];
         }

         System.out.println();

         for(int i=0 ; i<arr.length ; i++)
        {
            System.out.println("index ["+ i +"] : " + arr[i]);
        }

       

    }
    
}
