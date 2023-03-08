// write a program to perform temperature conversion (formula: 5/9*(F-32))

import java.util.Scanner;


public class temperature_conversion {
    
    public static void main(String[] args) {
        

        float f;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the F value = ");
        f = sc.nextFloat();

        System.out.println("temperature conversion = " + (5/(9 * (f - 32))));

    }

}
