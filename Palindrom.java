import java.util.Scanner;

public class Palindrom {
    
   public static void main(String[] args) {
       
     int num,c,rem, s=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number = ");
     num = sc.nextInt();

     c = num;

     while(num != 0)
     {
         rem = num % 10;
         s = (s*10) + rem;
         num = num / 10;
     }
      if(c == s)
      {
          System.out.println("palindrom");
      }
      else
      {
          System.out.println("not palindrom");
      }

   }

}
 
