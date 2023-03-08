import java.util.Scanner;

/*

*********** Exception Class in java ************
-> we can write our custom exception using exception class in java

   public class MyException extends Exception{

    // overridder methods

   }

The Exception class has following important methods:

1] String toString()  -> exccuted when sout(e) is run
2] void printStackTrace() -> prints stack trace
3] String grtMessage() -> print the exception message

The "throw" keyword:-
            the "throw" keyword is used to throw an exception explicitty by the programmer


*/


class MyException extends Exception{

   @Override
   public String toString(){
    //    return super.toString() + "I am toString()";
       return " I am toString() ";
   }

   @Override
   public String getMessage(){
    //    return super.getMessage() + "I am getMessage()";
       return " I am getMessage() ";
   }

}



public class class_expection {

    public static void main(String[] args) {
        

         int a; 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of a = ");
         a = sc.nextInt();


         if(a<99)
         {
             try
             {
                // throw new MyException();
                throw new ArithmeticException();
             }
             catch(Exception e)
             {
                 
                 System.out.println(e.getMessage());
                 System.out.println(e.toString());
                 e.printStackTrace();
                 System.out.println("finish");
                 

             }
             System.out.println("yes finish");

         }



    }


}
