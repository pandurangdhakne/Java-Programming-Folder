/**
 * Kadans_Alogorithm
 */
public class Kadans_Alogorithm {

    
    public static void main(String[] args) {
        

         // O(n) complexity requirment

         int [] arr = {5,-4,2,6,-1};

         int sum=0,max=0;
         for(int i=0 ; i < arr.length ; i++)
         {
 
            //   System.out.println(arr[i]);

            sum = sum + arr[i];

            if(sum >= max)
            {
                max = sum;
            }
          
            if(sum < 0)
            { 
                 sum = 0;
            }
 
         }
 
         System.out.println("max:  " + max);


    }


}