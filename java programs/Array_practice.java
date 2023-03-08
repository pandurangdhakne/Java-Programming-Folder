
import java.util.Scanner;

public class Array_practice {

    public static void main(String[] args) {
      // 1st type  
      int [] arr = new int[4];
      arr[0] = 10;
      arr[1] = 20;
      arr[2] = 30;
      arr[3] = 40;

      for(int i=0 ; i<arr.length ; i++)
      {
          System.out.println(arr[i]);
      }

      System.out.println();
      System.out.println();

      // 2nd type

      char [] ch = new char[5];
      ch[0] = 'a';
      ch[1] = 'b';
      ch[2] = 'c';
      ch[3] = 'd';
      ch[4] = 'e';

      for(int i=0 ; i<ch.length ; i++)
      {
          System.out.println(ch[i]);
      }

      
      System.out.println();
      System.out.println();

      // 3rd type for char for loop
      for(char i='A' ; i<='Z' ; i++)
      {
          System.out.print(i);
      }

      
      System.out.println();
      System.out.println();
    
      // 4th type
      int array[] = {10,20,30,40,50};
      for(int i=0 ; i<5 ; i++)
      {
          System.out.print(""+ array[i] +"");
      }

      for (int i : array) {
          System.out.println("\n"+ i);
      }


      


    }
    
}
