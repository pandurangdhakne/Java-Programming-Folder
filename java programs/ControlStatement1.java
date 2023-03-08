import java.util.*;


public class ControlStatement1 {
    
   public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      System.out.print
      ("Number of month : ");
      int num = sc.nextInt();
      String [] month = {"jan","feb","mar","apr","may","june","july","aug","sep","oct","nov","dec"};
      String [] days = {"31","29","31","30","31","30","31","30","31","30","31","30"};

      if(num>0)
      {
          System.out.println(month[num-1] + " has " + days[num-1] + " days ");
      }
      else if(num == 0)
      {
          System.out.println(month[num] + " has " + days[num] + " days ");
      }
      else
      {
          System.out.println("No month No days");
      }


   }

}
