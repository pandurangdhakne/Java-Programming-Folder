/*

   input:  str = "sadbutsad" , needle = "sad"
   output: 0 

   expalnation: "sad" occure at index 0 and 6.
                 The first occurenece is at index 0 , so we return 0

 */


import java.util.*;

public class FindTheIndexOfTheFirstOccurenceInAString {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Input string:  ");
       String str = sc.nextLine();

       System.out.println();

       System.out.print("Target string:   ");
       String target = sc.nextLine();

       int k = target.length();
       int i=0 ; int j=k; int count=0;

       while (i <= str.length() - k) {
        
                  if(target.equals(str.substring(i,j)))
                  {
                  
                     count++;

                     if(count == 1)
                     { 
                         System.out.println();
                         System.out.print("output   first occurenece is at index:  " + i);
                     }

                  }


                  i++ ; j++;         

       }

       System.out.println();
       System.out.print("count for the target element how many times repeat in the string:  " + count);

   
    }

}
