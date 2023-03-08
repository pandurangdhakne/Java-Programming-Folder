
import java.util.*;

public class LiftCodeConcept {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in); 

       int [] floar  = new int[3];
       int [] takeFloarNumber = new int[3];
       int [] sorttakeFloarNumber = new int[3];


       for(int i=1 ; i<=floar.length ; i++)
       {
           System.out.print("How many peoples enter in this floar: ");
           floar[i] = sc.nextInt();

           for(int j=1 ; j<=floar[i] ; j++)
           {
               System.out.println("Peoples please enter the floar number: ");
               int floar_number = sc.nextInt(); 

               takeFloarNumber[floar_number] = floar_number;


           }
       }

      int [] sorttakeFloarNumber =  Arrays.sort(takeFloarNumber);
       
       
     

     
        

        






  
    }

}
