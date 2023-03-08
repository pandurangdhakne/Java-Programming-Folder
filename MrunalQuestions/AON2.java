// dictionary sequence logic 
import java.util.*;
public class AON2 {
    
    public static void main(String[] args) {
        
/* 
        String s = "smart";
        String s1 = "small";

        System.out.println(s.compareTo(s1));  // give the difference between s and s1 with the help of  their ascii  values
        
        String temp;
        
        if(s.compareTo(s1) > 0)
        {
            temp = s1;
            s1 = s;
            s = temp;
        }

        System.out.println(s);  // small
*/

// abcdoom    abaaamm
         Scanner sc = new Scanner(System.in);

         String str1 = sc.nextLine();
         String str2 = sc.nextLine();

         str1 = str1.toLowerCase();
         str2 = str2.toLowerCase();
int j;

int count=0;

         for(char i='a' ; i<='z' ; i++)
         {

            int str1c=0;
            int str2c=0;

            for(j=0 ; j<str1.length(); j++)
            {
                   if(i == str1.charAt(j))
                   {
                    str1c++;
                   }
                   if(i == str2.charAt(j))
                   {
                    str2c++;
                   }
            }

/* 
            if(str1c > 0 )
            {
                System.out.println(i + " : " + str1c); 
            
            }
            if(str2c > 0 )
            {
                System.out.println(i + " = " + str2c); 
            }

*/

            if((Math.abs(str1c - str2c)) <= 3 )
            {
                   count = Math.abs(str1c - str2c);
                   
            }
            else
            {
                 count = Math.abs(str1c - str2c);
                 break; 
            }
      
            

          

         }




         if(count > 3)
         {
            System.out.println("-1" + " count : " + count);
         }
         else
         {

            String temp;
            if(str1.compareTo(str2) > 0)
            {
                  temp = str1;
                  str1 = str2;
                  str2 = temp;
            }
            System.out.println(str1 );

         }
    
            

            
        

    

    }

    

}
