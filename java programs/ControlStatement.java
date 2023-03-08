import java.util.*;


/*

write a java program , take two characters . If these characters are equal then print them as it is but if they are 
unequal then print their difference.

*/

public class ControlStatement {
    
       public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("character a = ");
        char a = sc.next().charAt(0);

        int ran = (int)(Math.random()*100);

        char b = (char)ran;
        System.out.print("\ncharacter b = "+ b);

        if(a == b)
        {
            System.out.print("a = "+ a + " " + "b = "+ b);
        }
        else
        {
            int num1, num2 ;
            num1 = (int)a;
            num2 = (int)b;

            int num3 = num1 - num2;
            System.out.println("\n
            difference between a & b = "+ num3);
        }



       }

}
