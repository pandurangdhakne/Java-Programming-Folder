import java.util.*;

public class TabelPattern {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("size = ");
        int size = sc.nextInt();
   
        for(int i=1 ; i<=size ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
               int c = i * j;

                System.out.print(c + " ");
            }
           
           System.out.println(); 
        }




    }

}
