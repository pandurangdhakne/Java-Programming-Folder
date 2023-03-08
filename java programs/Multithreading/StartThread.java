package Multithreading;

class A extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.print("thread 1");
        }
    }
}



public class StartThread {
 
        public static void main(String[] args) {
            
            A a1 = new A();
          

            a1.start();
          

        }
    
}
