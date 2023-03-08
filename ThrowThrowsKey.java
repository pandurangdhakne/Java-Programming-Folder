public class ThrowThrowsKey {
   
    public static void div(int a, int b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c;
            c = a/b;
            System.out.println(c);
        }
    }

    public static void run()
    {
        System.out.println("yes i am a run");
    }
    
    public static void main(String[] args) throws ArithmeticException {
        
        try {
            div(10,0);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }



        run();

    }


}
