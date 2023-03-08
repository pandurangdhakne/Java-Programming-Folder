
import java.util.*;
/*

q1] write a program in which students should enter marks of 5 different subbjects.If
    all subjects having above passing marks add them and provide to switch case to print 
    grades
    (first class,second class),if student get fail in any subject program should print
    "You failed in exam".

*/



public class SwitchCaseQ1 {
    
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     float english,marathi,math,history,geographic,tsub;
     System.out.print("Enter english subject marks out of 100 = ");
     english = sc.nextFloat();
     System.out.print("\nEnter marathi subject marks out of 100 = ");
     marathi = sc.nextFloat();
     System.out.print("\nEnter math subject marks out of 100 = ");
     math = sc.nextFloat();
     System.out.print("\nEnter history subject marks out of 100 = ");
     history = sc.nextFloat();
     System.out.print("\nEnter geographic subject marks out of 100 = ");
     geographic = sc.nextFloat();

     System.out.println("Number of subject count = ");
     tsub = sc.nextFloat();

     float avg;
     avg = english + marathi + math + history + geographic /tsub ;
     float total = english + marathi + math + history + geographic;
     System.out.println("Average = "+ avg);
     
     float per;
     per = (total/500)*100;
     
     System.out.println("Percentage = "+ per +"%");

     int num;
     System.out.println("\n 1st : Pass or Fail \n 2nd: Grade ");
     System.out.print("Enter the choice = ");
     num = sc.nextInt();     

     switch (num) {
         case 1:
             if(english > 35 && marathi > 35 && math > 35 && history > 35 && geographic > 35)
             {
                
                 System.out.println("Average of all subjects and you are Pass with = " + avg);
             }
             else
             {
                 if(english < 35)
                 {
                    System.out.println("You are fail in exam in english subject ");
                 }
                 else if(marathi < 35)
                 {
                    System.out.println("You are fail in exam marathi subject ");
                 }
                 else if(math < 35)
                 {
                    System.out.println("You are fail in exam in math subject ");
                 }
                 else if(history < 35)
                 {
                    System.out.println("You are fail in exam in history subject ");
                 }
                 else
                 {
                    System.out.println("You are fail in exam in geographic subject ");
                 }
                

             }
             break;

         case 2:
          
                 if(per>=65 && per<=100)
                 {
                     System.out.println("First Class");
                 }
                 else if(per<=65 && per>=35)
                 {
                    System.out.println("Second Class");
                 }
                 else
                 {
                    System.out.println(" Fail in exam ");
                 }

             break;

         default:
             break;
     }
     

    }

}
