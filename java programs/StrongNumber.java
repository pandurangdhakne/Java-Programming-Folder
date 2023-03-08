import java.util.*;


public class StrongNumber {
    
       public static int strongMethod(int n)
       {
         
           int fact=1;

           for(int i=1; i<=n ; i++)
           {
               fact = fact*i;

           }

           return fact;
       }
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int num = sc.nextInt();
        int sum = 0;
        int strong = num;

        while(num != 0)
        {
            int rem;
            rem = num%10;
            
            sum = sum + strongMethod(rem);
            
            num = num/10;
        }
        
        if(strong == sum)
        {
            System.out.println("Strong number");
        }
        else
        {
            System.out.println("Not strong number");
        }




     } 

}
