import java.util.Scanner;

//  try ... catch
// try ... catch ... finally

public class java_exception {

    public static void main(String[] args) {
         
        // int [] myint = {5,2,3};
        // System.out.println(myint[10]);  // error generate

        Scanner obj  = new Scanner(System.in);
        System.out.print("Enter the you want to show the idex number = ");
        int n = obj.nextInt();


        try {

            int [] myint = {5,2,3};
            System.out.println(myint[n]);

        } 
        catch (Exception e)
        {
            //TODO: handle exception
            System.out.println("could not this index of element");
            // System.out.println(e);
        }
        finally
        {
            System.out.println("The 'try ... catch' is finishedc");
        }


    }

}
