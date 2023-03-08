/*
write a program usinng DataInputStream class to enter a number and find its
reverse.
*/

import java.util.Scanner;
public class reverse_number {
    
    public static void main(String[] args) {
        
       int num;
       int rem;
       int reverse = 0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number = ");
       num = sc.nextInt();
       
       while (num != 0) {
           rem = num % 10;
           reverse = reverse*10 + rem;
           num = num/10;
       }
    
       System.out.println(reverse);
       


    }

}
