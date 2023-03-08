/*
write a program to find largest of three numbers using nested if..else.
Take input from user.
*/

import java.util.Scanner;

public class largerst_number {
   
    public static void main(String[] args) {
        
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("first number = ");
a = sc.nextInt();

System.out.println("second number = ");
b = sc.nextInt();

System.out.println("third number = ");
c = sc.nextInt();

if(a<b && c<b)
{
    System.out.println("b is greater than a&c" + "a="+a +" b="+b +" c="+c); 
}
else if(b<a && c<a)
{
    System.out.println("a is greater than b&c" + "a="+a +" b="+b +" c="+c);  
}

else if(b<c && a<c)
{
    System.out.println("c is greater than a&b" + "a="+a +" b="+b +" c="+c);
}

else
{
    System.out.println("check the values");
}


    }
}
