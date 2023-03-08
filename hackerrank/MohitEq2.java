
/*

   int [] arr = {10,4,3,1,5,13,11,12,15,14};

   -> above array is given and find the middle elemnet in that array
   -> then before middle element present all elements print in the asending form
   -> and after the middle element present element print in the desending form

 */
import java.util.*;

public class MohitEq2 {
    
    public static void main(String[] args) {
        
        int [] arr = {10,4,3,1,5,13,11,12,15,14};
        
        int [] ase = new int[5];
        int [] dec = new int[5];

        int mid = arr.length/2;

        for(int i=0 ; i<mid ; i++)
        {

            ase[i] = arr[i];
            

        }

        System.out.println();

        Arrays.sort(ase);

        for(int i=0 ; i<ase.length ; i++)  // asending
        {
            System.out.print(ase[i] + " " + i + "    ");
            arr[i] = ase[i];
          
        }

        System.out.println();
        
        for(int i=mid ; i<arr.length ; i++)  
        {
                int j = i-5;

                dec[j] = arr[i];
 

        }

        Arrays.sort(dec);

        int j = 1;
        for(int i=dec.length-1 ; i>=0 ; i--)   // decending
        {
            System.out.print(dec[i] + " " + i + "    ");
            
            int k = j + i;
            arr[k] = dec[i];

            j+=2;    
            
        }

        System.out.println();


 for(int i=0 ; i<arr.length ; i++)
 {
    System.out.print(arr[i] + " " + i + "      ");
 }

       

    }

}
