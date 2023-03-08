

//1] INPUT NUMBER = 153
//2] LOGIC = (1*1*1  +  5*5*5  +  3*3*3) = 153
//3] INPUT NUMBER == LOGIC , SO THIS IS ARMSTRONG NUMBER

import java.util.*;

public class Armstrong {
    
    public static void main(String[] args) {
     
        int num , c , arm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        num = sc.nextInt();
        c = num;

        while (num != 0) {
            
            int rem ;

            rem = num % 10;
            arm = (rem * rem * rem) + arm;
            num = num / 10;


        }

        if(c == arm)
        {
            System.out.println("Armstrong Number");
        }
        else121
        {
            System.out.println("Not Armstrong Number");
        }

    }

}
