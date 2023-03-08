
class A implements Runnable{

    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("stereo gym");
         }
    }

}





public class MultithreadRunnable {

    public static void main(String[] args)  {
     
         // this main block is 1st thread  JVM
     A obj = new A();
     Thread t1 = new Thread(obj);

     t1.start(); // 2nd thread

     for (int i = 0; i < 5; i++) {
        System.out.println("muskurane lage");
        Thread.sleep(1000);
     }



    }

}
