//   write a program  to receive two integer values as command line argumenets
//   and display sum.

import java.util.Scanner;

public class user_input_sum {

    public static void main(String[] args) {
        
        int a,b,sum;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the first element = ");
     a = sc.nextInt();

     System.out.println("enter the second element = ");
     b = sc.nextInt();

sum = a+b;

     System.out.println("sum = " + sum);
    

    }
    
}