/*

Let's create project whwre we are trying to ask the user to gusses a randomly .
The number is in the range 1 to 100.

condition:- 
1] if the user gusses a number that is greater we print "The number is too large".
2] if the user gusses a number that is smaller we print "The number is too small".
3] if the user is able to correctly gusses the number,then we print "Correct Number";

*/


import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class MiniProject {
    
 public static void main(String[] args) {
    
    int usernumber;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the user input = ");
    usernumber = sc.nextInt();

    int randomNumber = (int)(Math.random() * 100);

    if(usernumber > randomNumber)
    {
        System.out.println("usernumber = "+ usernumber);
        System.out.println("randomnumber = "+ randomNumber);
        System.out.println("The number is too large");
    }
    else if(usernumber == randomNumber)
    {
        System.out.println("usernumber = "+ usernumber);
        System.out.println("randomnumber = "+ randomNumber);
        System.out.println("Corret Number");
    }
    else
    {
        System.out.println("usernumber = "+ usernumber);
        System.out.println("randomnumber = "+ randomNumber);
        System.out.println("The number is too small");
    }
    
    

 }


}

