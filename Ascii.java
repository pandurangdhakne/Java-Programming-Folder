
/*

ASCII acronym for American Standard Code for Information Interchange. It is a 7-bit character set contains 128 (0 to 127) characters. It represents the numerical value of a character. For example, the ASCII value of A is 65.

In this section, we will learn how to print ASCII value or code through a Java program.

There are two ways to print ASCII value in Java:

Assigning a Variable to the int Variable
Using Type-Casting



*/

import java.util.*;

public class Ascii {
    

    public static void main(String[] args) {
     
        // 1st methode
        
        char c1 = 'a';
        int t1 = c1;    // widding type casting

        System.out.println("character = "+ c1);
        System.out.println("ASCII values of character "+c1+" = "+ t1);

       
        // 2nd method


        System.out.print("Enter a character: ");  
        Scanner sc = new Scanner(System.in);  
        char chr = sc.next().charAt(0);  
        int asciiValue = chr;  
        System.out.println("ASCII value of " +chr+ " is: "+asciiValue);  


    }


}
