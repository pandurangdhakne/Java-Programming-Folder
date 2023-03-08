import java.util.*;

/*

q2] write a program in which ask the user to enter a number from 0 to 5 
    and print it's spelling if the entered number is greater than 5 print
    entered number is greater thean 5(use if else or switch case). 

*/

public class SwitchCaseQ2 {

    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Number = ");
        num = sc.nextInt();
       

        String [] spelling = {"zero","one","two", "three","four","five"};

        if(num > 5)
        {
            System.out.println("entered number is greater than 5");

        }
        else
        {
            System.out.println(spelling[num]);
        }


    }

}
