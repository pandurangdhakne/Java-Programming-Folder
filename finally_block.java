

public class finally_block {
   // first type 
    static int div()
    {
        int a=6,b=0;
        try
        {
            int res = a/b;
            return res;
        }
        catch(Exception e)
        {
            System.out.println("e= "+ e);
        }
        finally
        {
            System.out.println("Cleaning up ... This is the end of the function");
        }
        // return -1;
        return 0;
    }


//main class
    public static void main(String[] args) {
        // first type
      int c = div();
      System.out.println("division= "+ c);
      


       // second type
       int m=7;
       int n=9;
       while(true)
       {
           try 
           {
                System.out.println("divide= "+ m/n);
           } 
           catch (Exception d) 
           {
               //TODO: handle exception
               System.out.println("d=" + d);
               break;
           }
           finally
           {
               System.out.println("finish !!!");
           }

           n--;


       }






    }


}
