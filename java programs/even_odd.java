// write a program to input number and check whether it is even and odd using simple if.

import java.util.*;

public class even_odd {
    
public static void main(String[] args) {

    int a;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number = ");

for(int i=0 ; i<=10 ; i++)
{
    a = sc.nextInt();
    
    if(a%2 == 0)
    {
        System.out.println("This is Even number");
    }
    else
    {
        System.out.println("This is Odd number");
    }
}


}

}
