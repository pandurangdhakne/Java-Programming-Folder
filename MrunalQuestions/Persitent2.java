/*

input = 123245
target = 2

output= 2

explanation= count the target element how many times occure in the input

 */

 import java.util.*;

public class Persitent2 {
    
    public static void main(String[] args) {
        

          int count = 0;

          Scanner sc = new Scanner(System.in);

          int num = sc.nextInt();
          int target = sc.nextInt();
/*
          while(num != 0 )
          {

            int rem = num % 10;

            num = num / 10;

            // System.out.print(rem);

            if(target == rem)
            {
                count ++;
            }

          }

          System.out.print("count : " + count);

    */


    String n = String.valueOf(num);
    String t = String.valueOf(target);

    for(int i=0 ; i<n.length() ; i++)
    {
        
        if(t.equals(String.valueOf(n.charAt(i))))
        {
            count++;
        }
      

    }

    System.out.print("count : " + count);



    }

}
