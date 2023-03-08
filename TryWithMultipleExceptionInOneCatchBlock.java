public class TryWithMultipleExceptionInOneCatchBlock {
    
    public static void main(String[] args) {
        
       try{
           int [] a = {10,20,30,40,50};
           System.out.println(a[100]);
       }
       catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
       {
           System.out.print("Exception is = "+ e);
       }

    }

}

