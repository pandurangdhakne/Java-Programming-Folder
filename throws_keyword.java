


public class throws_keyword {
    
    static int div(int a, int b) throws ArithmeticException
    {
       if(b == 0)
       {
           throw new ArithmeticException();
       }

 
        int result = a/b;
        return result;
    }

    static int division(int n, int m) throws NegativeArraySizeException
    {
       if(m < 0)
       {
           throw new NegativeArraySizeException();
       }


        int res = n/m;
        return res;
    }



    // main class
    public static void main(String[] args) {
        
        try 
        {
            int c = div(6,0);
            System.out.println(c);  
            System.out.println("\n\n");
           
        }   
        catch (ArithmeticException e) 
        {
            //TODO: handle exception
            System.out.println("exception occured here!!!  first");
            System.out.println("e= "+ e);
            e.printStackTrace();
        }

System.out.println("\n\n");        

        try 
        {
            int d = division(6,-1);
            System.out.println(d);  
            System.out.println("\n\n");
           
        }   
        catch (Exception g ) 
        {
            //TODO: handle exception
            System.out.println("exception occured here!!!  second");
            System.out.println("g= "+ g);
            g.printStackTrace();
        }
        



    }

}
