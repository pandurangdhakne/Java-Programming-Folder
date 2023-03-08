import java.util.Scanner;

public class decrimental_array {

    public static void main(String[] args) {
        
      int [] marks = new int[5];
      marks[0] = 50;
      marks[1] = 60;
      marks[2] = 70;
      marks[3] = 80;
      marks[4] = 90;

      System.out.println("marks lenght = "+ marks.length);

System.out.println("use to simple way");

      System.out.println(marks[0]);
      System.out.println(marks[1]);
      System.out.println(marks[2]);
      System.out.println(marks[3]);
      System.out.println(marks[4]);



System.out.println("for-loop decriment \n");     

        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.print(" "+marks[i]);
        }
System.out.println("\n \n");  



System.out.println("user difine array");  

        int [] flat_number = new int[4];
        Scanner sc = new Scanner(System.in);
       
        for(int i=0;i<flat_number.length;i++)
        {
            System.out.println("Enter the flat numbers= ");
            flat_number[i] = sc.nextInt();

        }

        System.out.println("\n \n");

        for(int i=flat_number.length-1;i>=0;i--)
        {
         System.out.print(" "+flat_number[i]);   
        }




    }

}
