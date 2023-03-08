import java.util.*;

/*

q3] write a program which user should enter two numbers if both the
numbers are positive multiply them and provide to switch case to verify 
number is even or odd,if user enters any negative number program should 
terminate saying "Sorry negative numbers not allowed".

*/


public class SwitchCaseQ3 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         int num1,num2;
         System.out.print("num1= ");
         num1 = sc.nextInt();
         System.out.print("\nnum2= ");
         num2 = sc.nextInt();

         if(num1>0 && num2>0)
         {int key;
            System.out.println("\n 1st even or odd");
            key = sc.nextInt();
             switch (key) {
                 case 1:
                     if(num1%2 == 0 && num2%2 == 0)
                     {
                         System.out.println("num1 and num2 is even");
                     }
                     else{
                         System.out.println("num1 and num2 is odd");
                     }
                     
                     break;
             
                 default:
                     break;
             }
         }
         else
         {
             System.out.println("Sorry given number is negative");
             System.exit(0);
         }

    }
}
