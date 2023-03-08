
class A{

    public void exc()  throws ArithmeticException
    {
        int a=12,c,b=0;
        c = a/b;
        System.out.print("division = "+ c);
    } 

    public void run() throws ArithmeticException  
    {
        System.out.println("run function excuted");
        int k = 5;
        String s2 = String.valueOf(k);
        String s1 = Integer.toString(k);
        System.out.println("String s1 = "+ s1);
        System.out.println("String s2 = "+ s2);
        exc();// method calling with exception 
    }

}


public class ExceptionWithFunctionCalling {
   
      public static void main(String[] args) {
        
        A t1 = new A();
       
        try {
            t1.run();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

      }    

}
