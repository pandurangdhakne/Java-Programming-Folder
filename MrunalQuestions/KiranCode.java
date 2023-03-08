import java.util.Scanner;

public class KiranCode {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         
         char ch = sc.next().charAt(0);

         int i = ch;

        //  System.out.println(i);

       
        String s = String.valueOf(ch);

        s = s.toLowerCase();

        if(s.equals("a") || s.equals("e")|| s.equals("i")|| s.equals("o") || s.equals("u"))
        {
            System.out.println("Vowel");
        }
        else
        {
            if(i < 65)
           {
              System.out.println("Invalid Output");
           }
           else
           {
              System.out.println("Consonant");
           }
           
        }

        

      




    }

}
