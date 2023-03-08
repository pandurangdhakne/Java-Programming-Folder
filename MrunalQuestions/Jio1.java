import java.util.*;

public class Jio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int billAmount = sc.nextInt();

        int totalBill = 0;

        while (billAmount > 0) {
            
          int rem = billAmount % 10;

          if((rem%2) != 0 )
          {
           totalBill = totalBill + rem;
          }

          billAmount = billAmount / 10;


        }

        System.out.println(totalBill);





    }

}
