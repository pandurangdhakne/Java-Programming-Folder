class A extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("thread 1");
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("thread 3");
        }
    }
}

public class Therading {
    
    public static void main(String[] args) {
        
        A a1 = new A();
        B b1 = new B();

        a1.start();
        b1.start();
           

       
    }
}
