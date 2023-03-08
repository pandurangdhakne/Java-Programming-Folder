/*
write a program to enter a number using command line and find sum
of  its digits.
*/

import java.util.Scanner;

public class sum_of_squares {
    
  public static void main(String[] args) {
  
    int i=1;
    int sum=0;

    
    while (10>=i) {
        System.out.println("number is= "+i);
        sum = sum + (i*i);  // square of the first 10 integer nbumbers
        i++;
    }
  
    System.out.println(sum);

  }

}
