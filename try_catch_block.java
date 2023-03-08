
/*
 ******* Exception in java *********
 A exception is an event that occurs when a program  is excuted dispting 
 the normal flow of instructions there are mainly two types of exception in java
 1] checked exception  ->   compile time exception (handled by compiler)
 2] unchecked exception ->  runtime exception

*/

/*
******** commanly occuring exception ********
following are few commanly exception in java
1] Null Pointer Exception
2] Arthimetic exception
3] ArrayIndexOutOfBound exception
4] IlegalArgument exception
5] NumberFormat exception

*/



public class try_catch_block {

    public static void main(String[] args) {
        
     int a=100;
     int b=0;
     int c;

            try {
                c=a/b;
                System.out.println("dividation is="+c);
            } catch (Exception e) {
                //TODO: handle exception

                System.out.println("We failed to divide. Reason: ");
                System.out.println(e);
                
            }


    }

}
