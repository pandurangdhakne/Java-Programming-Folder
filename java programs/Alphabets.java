import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Alphabets {
    
    public static void main(String[] args) {
        // number to character

        Scanner sc = new Scanner(System.in);
       
         for(int i=65 ; i<=90 ; i++)
         {
             char ch; 
             ch = (char)i;
             System.out.print(i + "=" + ch + "  \n");

         }


         System.out.println("\n\n\n");

         
         // character to number
         for(char ch='A' ; ch<='Z' ; ch++)
         {
             int num;
             num = (int)ch;
             System.out.println(ch + "=" + num + "  \n");
         }
        

         System.out.println("\n\n\n");

        // find the character is lowerCase or upperCase

         System.out.print("Character = ");
         char ch = sc.next().charAt(0);
         int c = (int)ch;

         if(c>=97 && c<=122 )
         {
             System.out.println("character is lowerCase: "+ ch );
         }
         else if(c>=65 && c<=90)
         {
             System.out.println("character is upperCase: "+ ch);
         }
         else
         {
             System.out.println("Otherwise this is special sysmbol: "+ ch );
         }



    }


}
