import java.util.Scanner;


public class FabonacciSeries {
    
    public static void main(String[] args) {
        
       int term,c ;
       int a=0;
       int b=1;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the term = ");
       term = sc.nextInt();

       for(int i=1 ; i<=term; i++)
       {
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
       }

     
    }
    
}
