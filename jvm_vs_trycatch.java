// 1] exception handle with the help of "throws"

/*

public class jvm_vs_trycatch {
    
    public static void main(String[] args) throws InterruptedException
    {
        
         for(int i=1 ; i<=10 ; i++)
         {
             Thread.sleep(1000);
             System.out.print(i);
         }

    }

}


*/

// 2] exception handle with the "throws" with "method"

/*
public class jvm_vs_trycatch {

    public static void main(String[] args) {
        
       try {
        show();
       } catch (Exception e) {
           //TODO: handle exception
           System.out.println(e);
       }

    }
    
    
    static void show() throws InterruptedException
    {

       for(int i=1 ; i<=10 ; i++)
       {
           Thread.sleep(1000);
           System.out.println(i);
       }

    }


    
}


*/


// 3] exception handle with simple try_catch


public class jvm_vs_trycatch {

     public static void main(String[] args) {
         
        try {
            for(int i=1 ; i<=10 ;i++)
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

     }
    
}











