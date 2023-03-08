import java.util.ArrayList;
import java.util.Scanner;

public class prime_number{
    public static void main(String[] args) {


        int i,n,count=0;

      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number= ");
      n = sc.nextInt();


          for(i=1 ; i<=n ; i++)
          {
              if(n%i == 0)
              {
                  count++;
              }
          }

          if(count == 2)
          {
              System.out.println("Yes Prime Number");
          }

          else
          {
            System.out.println("No Prime Number");
          }


    }
}