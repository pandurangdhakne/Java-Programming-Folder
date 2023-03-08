/*

Example:
Consider string S = "abcefuji";
At index 3 i.e haractre "e" is surrounding by character "c" and "f" before and after respectivly.
At index 5 i.e haractre "u" is surrounding by character "f" and "j" before and after respectivly.
Hence , the number of special character is 2.


Note:
The index of the string starts at 0
Vowels: The letters a,e,i,o and u are called vowels.
Consonants: All the alphabets in the string except a,e,i,o and u are known as consonants


*/

import java.util.*;
public class CoffeeQ1 {
    
    public static boolean element(char s)
    {

        return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u';

    }

    public static void main(String[] args) {
        
   
        Scanner sc = new Scanner(System.in);

        String str = "abcefujikljhoplkl";

        int count=0;

        for(int i=1 ; i<str.length()-1 ; i++)
        {

                // System.out.println(str.charAt(i));

            char ch = str.charAt(i);

            
            if(element(ch))
            {
                int before = str.indexOf(ch);
                int after = str.indexOf(ch);

            //    System.out.println(str.charAt(before-1) + "   " + ch + "   " + str.charAt(after+1)); 

            
              if(  !(  element(str.charAt(before-1))  )   &&  !(   element(str.charAt(after+1))   ) )
              {

                System.out.println(str.charAt(before-1) + "   " + ch + "   " + str.charAt(after+1)); 
                count++;

              }

            }
              

              

        }

      

        System.out.println("count : " + count);
             


    }


}
