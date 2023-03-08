/**
 * Recursion
 */

import java.util.*;

public class Recursion {

    static void fun(int n)
    {
        
         if(n>=1)
         {
            System.out.println(n + "\n");

             fun(n-1);
                  
         }
    
        if(n>0)
        {
            System.out.print(n + " ");
        }
         
       
    }
    public static void main(String[] args) {
        
          fun(5);


    }

}