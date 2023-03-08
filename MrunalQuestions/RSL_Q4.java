// reverse string print without inbuild function

import java.util.*;
public class RSL_Q4 {
    
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
 
            System.out.print("Before reverse :  " + str + "\n");

            System.out.print("Aftre reverse :  ");

            for(int i=str.length()-1 ; i>=0 ; i-- )
            {

                 System.out.print(str.charAt(i));


            }
         


    }

}
