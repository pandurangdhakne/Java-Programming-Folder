
/*
 find the first two element who's the difference is one and retuen them
 */

import java.util.*;
public class BentlyCode1 {
    
    public static void main(String[] args) {
        

        int [] arr = {1,5,9,11};

        Arrays.sort(arr);

        for (int i : arr) {
            
            System.out.print(i + " ");

        }
        System.out.println();
        
        int i,flag = 0;

        for(i=1 ; i<arr.length ; i++)
        {

          

            if(Math.abs((arr[i]-arr[i-1])) == 1)
            {

                flag = 1;
                break;
            }

        }

        System.out.println("index 1st element : " + i + "\n" + "index 2nd element : " + (i-1));
        /* 
        
        if(flag == 1)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
        */

        System.out.println(flag == 1? true: false);   // ternary operator

    }

}
