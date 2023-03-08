
/*
 write a program to enter any character and check whwther it is alphabet,digit 
 or special sysmbol using else if ladder
 */

 import java.util.Scanner;

public class alphabet_digit_specialSym {

    public static void main(String[] args) {
        
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character = ");
        ch = sc.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.println("alphabet = "+ ch);
        }
    
        else if(ch >= 'o' && ch <= '9')
        {
            System.out.println("digit = "+ch);
        }
       
        else
        {
            System.out.println("special sysmbol = "+ch);
        }





    }

  
}