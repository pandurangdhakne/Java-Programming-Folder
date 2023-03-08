import java.util.Scanner;
import java.util.Stack;

public class StringQuestion2 {
   
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     Stack<Character> st = new Stack<Character>();

     String s = "Pandurang dhakne";

     for(int i=0; i<s.length(); i++)
     {

         if(s.charAt(i) == ' ')
         {
               st.push(s.charAt(i));
         }
         else
         {
              while (st.empty() == false) {
                  
                   System.out.print(st.pop());

              } 

              System.out.print(" ");
         }

     }

      while (st.empty() == false) {
        
        System.out.print(st.pop());

     }
      
      

    }
    
}
