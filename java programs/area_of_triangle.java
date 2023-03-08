import java.util.Scanner;

//  write a program to find area of traingle using constant values.(formula a=1/2*b*h)

import java.util.Scanner;

public class area_of_triangle {
 
    public static void main(String[] args) {
        
float a,b,h;

Scanner sc = new Scanner(System.in);

System.out.println("enter the value of breath = ");
b = sc.nextFloat();


System.out.println("enter the value of height = ");
h = sc.nextFloat();
    
a = (b*h)/2;
System.out.println("Area of traingle = " + a);



}
    


}

