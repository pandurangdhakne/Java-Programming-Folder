import java.util.*;



public class ReverseNum {
    

    public static void main(String[] args) {
        
       int num,rem;
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the number = ");
       num = sc.nextInt();
      
      System.out.print("reverse num is = ");
      while (num != 0) {
        
          rem = num % 10;
      
          num = num / 10;
          System.out.print(rem);
      }
    
 
  

    }


}
